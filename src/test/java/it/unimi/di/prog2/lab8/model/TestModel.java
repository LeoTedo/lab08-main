package it.unimi.di.prog2.lab8.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import it.unimi.di.prog2.lab8.Observer;
import org.junit.Test;

public class TestModel {

  @Test
  public void testSetterGetter() {
    TemperatureModel model = new TemperatureModel();
    //inizializzazone
    assertEquals(0, model.getTemp(), 0.01);
    //setter
    model.setTemp(42.42);
    //getter
    assertEquals(42.42, model.getTemp(), 0.01);
  }

  @Test
  public void testNotifyObservers() {
    Observer<Double> obs =  mock(Observer.class);
    Observer<Double> obs1 = mock(Observer.class);

    TemperatureModel model = new TemperatureModel();

    model.addObserver(obs);
    model.addObserver(obs1);

    model.setTemp(42.42);

    verify(obs).update(model, 42.42);
    verify(obs1).update(model, 42.42);
  }

  @Test
  public void testNotifyObserversOnlyIfChanged() {
    Observer<Double> obs =  mock(Observer.class);
    Observer<Double> obs1 = mock(Observer.class);

    TemperatureModel model = new TemperatureModel();

    model.addObserver(obs);
    model.addObserver(obs1);

    model.setTemp(42.42);
    model.setTemp(42.40);
    model.setTemp(42.40);

    verify(obs, times(2)).update(eq(model), any());
    verify(obs1, times(2)).update(eq(model), any());
  }
}
