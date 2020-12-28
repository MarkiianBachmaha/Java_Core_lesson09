/*
 * Homework, 'Java Core' module in LOGOS IT Academy
 * Lesson 09 Exception, Java Code Convention
 * task 01
 */

package task01;

/**
 * Application about months and seasons
 * 
 * @author Markiian
 * 
 * version 1.0
 * 
 */

public enum Months {

	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.AUTUMN), OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN),
	DECEMBER(31, Seasons.WINTER);

	private int days;
	private Seasons seasons;

	private Months(int days, Seasons seasons) {
		this.days = days;
		this.seasons = seasons;
	}

	public int getDays() {
		return days;
	}

	public Seasons getSeasons() {
		return seasons;
	}

}