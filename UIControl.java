package com.ajayganesh;

public abstract class UIControl {
  private boolean isEnabled;

  protected UIControl(boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  protected UIControl() {
    this.isEnabled = false;
  }

  public abstract void render();

  public void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
