package com.ajayganesh;

public class TextBox extends UIControl {
  private String text = ""; // Field

  public TextBox() {
    super(true);
  }

  @Override
  public String toString() {
    return text;
  }

  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  public void setText(String newText) {
    this.text = newText;
  }

  public void clear() {
    text = "";
  }

  public void printText() {
    System.out.println(this.text);
  }
}
