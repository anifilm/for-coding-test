// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
package chap02.section2;
import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21;  // 시력 분포 (0.0에서 0.1 단위로 21개)

    static class PhyscData {
        String name;   // 이름
        int height;    // 키
        double vision; // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }
    // 키의 평균값을 구함
    static double aveHeight(PhyscData[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++)
            sum += data[i].height;
        return sum / data.length;

    }
    // 시력 분포를 구함
    static void distVision(PhyscData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX/10.0)
                dist[(int)(data[i].vision*10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.3),
                new PhyscData("함진아", 173, 0.7),
                new PhyscData("최윤미", 175, 2.0),
                new PhyscData("홍연의", 171, 1.5),
                new PhyscData("이수진", 168, 0.4),
                new PhyscData("김영준", 174, 1.2),
                new PhyscData("박용규", 169, 0.8),
        };
        int[] vdist = new int[VMAX];  // 시력 분포

        System.out.println("   [신체 검사 리스트]");
        System.out.printf("%-8s%2s%8s\n", " 이름", "키", "시력");
        System.out.println("---------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%8.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);  // 시력 분포를 구함

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f ~ :%2d명\n", i / 10.0, vdist[i]);
    }
}
