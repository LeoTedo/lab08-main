package it.unimi.di.prog2.lab8.presenter;

import it.unimi.di.prog2.lab8.Observer;
import org.jetbrains.annotations.NotNull;

public interface Presenter extends Observer<Double> {
  void updateModel(@NotNull String text);
}
