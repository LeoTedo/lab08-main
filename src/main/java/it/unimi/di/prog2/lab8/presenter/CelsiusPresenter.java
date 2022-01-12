package it.unimi.di.prog2.lab8.presenter;

import it.unimi.di.prog2.lab8.Observable;
import it.unimi.di.prog2.lab8.model.Model;
import it.unimi.di.prog2.lab8.view.MyTextView;
import it.unimi.di.prog2.lab8.view.View;
import org.jetbrains.annotations.NotNull;

public class CelsiusPresenter implements Presenter{
    private final Model t;
    private final View v;

    public CelsiusPresenter(Model t, View v) {
        this.t = t;
        this.v = v;
        t.addObserver(this);
        v.addHandlers(this);
    }
    @Override
    public void update(@NotNull Observable<Double> subject, @NotNull Double state) {
        v.setValue(t.getState().toString());
    }

    @Override
    public void updateModel(@NotNull String text) {
        t.setTemp(Double.parseDouble(text));
    }
}
