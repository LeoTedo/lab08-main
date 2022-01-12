package it.unimi.di.prog2.lab8;

import org.jetbrains.annotations.NotNull;

public interface Observable<T> {
  void notifyObservers();

  void addObserver(@NotNull Observer<T> obs);

  @NotNull T getState();
}
