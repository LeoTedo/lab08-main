package it.unimi.di.prog2.lab8.model;

import it.unimi.di.prog2.lab8.Observable;

public interface Model extends Observable<Double> {
  double getTemp();
  void setTemp(double temp);
}
