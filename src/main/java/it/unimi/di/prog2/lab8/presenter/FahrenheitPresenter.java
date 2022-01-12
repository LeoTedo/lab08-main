package it.unimi.di.prog2.lab8.presenter;

import it.unimi.di.prog2.lab8.Observable;
import it.unimi.di.prog2.lab8.model.Model;
import it.unimi.di.prog2.lab8.model.TemperatureModel;
import it.unimi.di.prog2.lab8.view.MyTextView;
import it.unimi.di.prog2.lab8.view.View;
import org.jetbrains.annotations.NotNull;

public class FahrenheitPresenter implements Presenter{
    private final Model t;
    private final View v;

    public FahrenheitPresenter(Model t, View v) {
            this.t = t;
            this.v = v;
            t.addObserver(this);
            v.addHandlers(this);
    }

    @Override
    public void update(@NotNull Observable<Double> subject, @NotNull Double state) {
        Double convertito;
        convertito = (t.getState() * 9/5) + 32;
        v.setValue(convertito.toString());
    }

    @Override
    public void updateModel(@NotNull String text) {
        Double convertito;
        convertito = (Double.parseDouble(text) - 32) * 5/9;
        t.setTemp(convertito);
    }
}
