package com.ajayganesh.streams;

public class Movie {
  private String title;
  private int likes;
  private Genre genre;

  public Movie(Genre genre, int likes, String title) {
    this.genre = genre;
    this.likes = likes;
    this.title = title;
  }

  public int getLikes() {
    return likes;
  }

  public String getTitle() {
    return title;
  }

  public Genre getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return title;
  }


}
