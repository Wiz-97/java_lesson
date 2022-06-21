package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DayTimeTest {
	public static void main(String[] args) {
		// ����ð�: ms, ns(1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ��

		// 1��, 1���� ���� �� ms�ϱ�? 1��=1000ms
		// 1��=24�ð�*60��*60��*1000 => result ������ ����
		int result = 24 * 60 * 60 * 1000;
		System.out.println("1���� " + result + "ms�Դϴ�.");
		// int ������ ����� overflow ���°� �ǹǷ� long ��ȯ�� �ʿ�
		System.out.println("1���� " + result * 365L + "ms�Դϴ�.");

		// �ڸ��� ����
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " + df.format(result) + "ms�Դϴ�.");
		System.out.println("1���� " + df.format(result * 365L) + "ms�Դϴ�.");
		// String.format("%15s",~)���� �ϸ� �ڸ� ���� ��ġ ���� �� ����

		/*
		 * ��¥�� �ð������� �ٷ�� �ڹ�Ŭ���� ����
		 * 1) java.util.Date Ŭ����
		 * 2) java.util.Calendar Ŭ���� ���� �ΰ��� ��(old)���� Ŭ����
		 * 3) java 8���� java.time.LocalDate(��¥), LocalTime(�ð�), LocalDateTime(��¥�� �ð�) Ŭ��
		 * 4) java.sql.Date Ŭ���� - �����ͺ��̽� �ٷ� �� ���
		 */
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("��¥ Ȯ��: " + currentDate);

		LocalTime currentTime = LocalTime.now();
		System.out.println("�ð� Ȯ��: " + currentTime);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ��: " + current);

		// of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1997, 03, 16);
		System.out.println("�� ���� Ȯ��: " + mybirth);

		LocalTime mybirthtime = LocalTime.of(03, 44);
		System.out.println("�� ź�� �ð� Ȯ��: " + mybirthtime);

		// �� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ ����
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears() + "��(years)" + between.getMonths() + "����(months)"
				+ between.getDays() + "��(days)");

		System.out.println("���� �¾�� " + ChronoUnit.DAYS.between(mybirth, currentDate) + "�� �������ϴ�.");

		// Duration Ŭ����
		// ChronoUnit Ŭ����
	}
}
