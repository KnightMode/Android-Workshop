package com.example.shreeghanesh.myapplication.basecomponents;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.inject.Singleton;

import io.reactivex.subjects.PublishSubject;

//This component is used to Pass data between ViewModels
@Singleton
public class DataProviders {
    ConcurrentMap<Class, UseCase> transientDataNew = new ConcurrentHashMap<>();
    PublishSubject<Class> dataSubjectNew = PublishSubject.create();
    private static DataProviders dataProviders;

    private DataProviders() {
    }

    public static DataProviders getDataProviderInstance() {
        if (dataProviders == null) {
            dataProviders = new DataProviders();
        }
        return dataProviders;
    }

    public void save(UseCase useCase) {
        final Class<? extends UseCase> useCaseClass = useCase.getClass();
        if (!transientDataNew.containsKey(useCaseClass)) {
            transientDataNew.put(useCaseClass, useCase);
            dataSubjectNew.onNext(useCaseClass);
        } else {
            throw new NoSuchElementException("Element Already Exists");
        }
    }

    public <T extends UseCase> T get(Class<T> useCaseClass) {
        if (containsUseCase(useCaseClass)) {
            final UseCase removedUseCase = transientDataNew.remove(useCaseClass);
            return useCaseClass.cast(removedUseCase);
        } else {
            throw new NoSuchElementException("Expected: " + useCaseClass.getName());
        }
    }

    public <T extends UseCase> boolean containsUseCase(Class<T> useCaseClass) {
        return transientDataNew.containsKey(useCaseClass);
    }
}
