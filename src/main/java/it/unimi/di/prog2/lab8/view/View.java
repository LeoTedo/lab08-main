package it.unimi.di.prog2.lab8.view;

import it.unimi.di.prog2.lab8.presenter.Presenter;
import org.jetbrains.annotations.NotNull;

public interface View {
  void addHandlers(@NotNull Presenter pres);

  @NotNull String getValue();
  void setValue(@NotNull String val);
}
