package yads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rd1 {
    public static final String a(long j10) {
        if (j10 < 0) {
            return "invalid";
        }
        if (j10 < 1000) {
            return "<1";
        }
        if (1000 <= j10 && j10 < 2001) {
            return "1-2";
        }
        if (2001 <= j10 && j10 < 3001) {
            return "2-3";
        }
        if (3001 <= j10 && j10 < 5001) {
            return "3-5";
        }
        if (5001 <= j10 && j10 < 10001) {
            return "5-10";
        }
        if (10001 <= j10 && j10 < 15001) {
            return "10-15";
        }
        if (15001 <= j10 && j10 < 20001) {
            return "15-20";
        }
        if (20001 <= j10 && j10 < 30001) {
            return "20-30";
        }
        if (30001 <= j10 && j10 < 60001) {
            return "30-60";
        }
        if (60001 <= j10 && j10 < 300001) {
            return "60-300";
        }
        if (300001 > j10 || j10 >= 1800001) {
            return (1800001 > j10 || j10 >= 7200001) ? ">7200" : "1800-7200";
        }
        return "300-1800";
    }
}
