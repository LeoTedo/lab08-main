package it.unimi.di.prog2.lab8.presenter;

import static org.mockito.Mockito.*;

import it.unimi.di.prog2.lab8.model.Model;
import it.unimi.di.prog2.lab8.view.View;
import org.junit.Test;

public class TestPresenter {
  //TODO scommentare solo se si è scelta realizzazione di una sola classe TemperaturePresenter
/*
  @Test
  public void testScaledToModel() {
    View view = mock(View.class);
    Model model = mock(Model.class);
    ScaleStrategy scale = mock(ScaleStrategy.class);
    when(scale.valueToCelsius(14.0)).thenReturn(42.42);

    Presenter SUT = new TemperaturePresenter(model, view, scale);

    SUT.updateModel("14");
    verify(model, times(1)).setTemp(42.42);
  }


  @Test
  public void testScaledToView() {
    View view = mock(View.class);
    Model model = mock(Model.class);
    ScaleStrategy scale = mock(ScaleStrategy.class);
    when(scale.valueFromCelsius(14.0)).thenReturn(42.421111);

    Presenter SUT = new TemperaturePresenter(model, view, scale);

    SUT.update(model, 14.0);
    verify(view, times(1)).setValue("42.42");
  }
 */


  //TODO scommentare solo se si è scelta realizzazione di due classi Presenter per testare FahrenheitPresenter

  @Test
  public void testScaledToModel() {
    View view = mock(View.class);
    Model model = mock(Model.class);

    Presenter SUT = new FahrenheitPresenter(model, view);

    SUT.updateModel("32");
    verify(model, times(1)).setTemp(0);
  }


  @Test
  public void testScaledToView() {
    View view = mock(View.class);
    Model model = mock(Model.class);
    when(model.getState()).thenReturn(0.0);

    Presenter SUT = new FahrenheitPresenter(model, view);

    SUT.update(model, 0.0);
    verify(view, times(1)).setValue("32.0");
  }


}
