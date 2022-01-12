package it.unimi.di.prog2.lab8;

import org.jetbrains.annotations.NotNull;

public interface Observer<T> {
  void update(@NotNull Observable<T> subject, @NotNull T state);
}
