package it.unimi.di.prog2.lab8.model;

import it.unimi.di.prog2.lab8.Observer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TemperatureModel implements Model {
  private double celsius;
  private ArrayList<Observer<Double>> observers = new ArrayList<>();
  @Override
  public void notifyObservers() {
    for (Observer<Double> observer:
         observers) {
      observer.update(this, getState());
    }
  }

  @Override
  public void addObserver(@NotNull Observer<Double> obs) {
    observers.add(obs);
  }

  @Override
  public @NotNull Double getState() {

    return new Double(getTemp());
  }

  @Override
  public double getTemp() {
    return celsius;
  }

  @Override
  public void setTemp(double temp) {
    if (temp != celsius){
      celsius = temp;
      notifyObservers();
    }


  }

}
