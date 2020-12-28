/*
 * Homework, 'Java Core' module in LOGOS IT Academy
 * Lesson 09 Exception, Java Code Convention
 * task 01
 */

package task01;

import java.util.Scanner;

/**
 * Application about months and seasons
 * 
 * @author Markiian
 * 
 * version 1.0
 * 
 */

public class Menu {

	static void menu() {
		System.out.println("�������� 1, ��� ���������, �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �����, �� �������� ���� � �� ���� ��� ����");
		System.out.println("�������� 3, ��� ������� ����� � ��������� ������� ���");
		System.out.println("�������� 4, ��� ������� �����, �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �����, �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �����, �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �����, �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* arrays for Seasons and Months for for-loops */
		Seasons[] masSea = Seasons.values();
		Months[] masMon = Months.values();

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = isMonthPresent(masMon, month); // method that checks presence of the month

				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "2": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : masMon) {

					if (m.getSeasons().name().equals(season)) {

						flag = true;
					}
				}

				if (flag) {
					Seasons se = Seasons.valueOf(season);
				}
				for (Months mo : masMon) {
					if (mo.getSeasons().name().equalsIgnoreCase(season)) {
						System.out.println(mo);
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "3": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() == m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "4": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() < m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "5": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() > m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "6": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(masSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == (masSea.length - 1)) {
						ordinal = 0;
						System.out.println(masSea[ordinal]);
					} else {
						System.out.println(masSea[ordinal + 1]);
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "7": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(masSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == 0) {
						ordinal = (masSea.length - 1);
						System.out.println(masSea[ordinal].name());
					} else {
						System.out.println(masSea[ordinal - 1].name());
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "8": {

				for (Months m : masMon) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(
								"This month has an even number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;

			}
			case "9": {
				for (Months m : masMon) {
					if ((m.getDays() % 2) != 0) {
						System.out.println(
								"This month has an odd number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;
			}
			case "10": {
				System.out.println("Enter the month");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					if ((m.getDays() % 2) == 0) {
						System.out.println("Month " + month + " has an even number of days;");

					} else {
						System.out.println("Month " + month + " has an odd number of days;");
					}

				}

				incorrectMonth(month, flag);
				System.out.println();

				break;
			}

			}
		}
	}

	// method that reports absence of the season

	private static void incorrectSeason(String season, boolean flag) {
		if (flag) {
			season = season;
		} else {
			try {
				throw new WrongInputConsoleParametersException();
			} catch (WrongInputConsoleParametersException a) {
				System.out.println("This season doesn`t exist, enter the correct season;");
			} finally {
				System.out.println("The program continues to run...");
			}
		}
	}

	// method that reports absence of the month

	private static void incorrectMonth(String month, boolean flag) {
		if (flag) {
			month = month;
		} else {
			try {
				throw new WrongInputConsoleParametersException();
			} catch (WrongInputConsoleParametersException a) {
				System.out.println("This month doesn`t exist, enter the correct month;");
			} finally {
				System.out.println("The program continues to run...");
			}
		}
	}

	// method that checks presence of the season

	private static boolean isSeasonPresent(Seasons[] masSea, String season) {

		boolean flag = false;

		for (Seasons s : masSea) {

			if (s.name().equals(season)) {
				System.out.println("Season exist");
				flag = true;
			}
		}
		return flag;
	}

	// method that checks presence of the month

	private static boolean isMonthPresent(Months[] masMon, String month) {

		boolean flag = false;

		for (Months m : masMon) {

			if (m.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}
}