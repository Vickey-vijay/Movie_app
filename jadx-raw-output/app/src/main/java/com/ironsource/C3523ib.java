package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;

/* JADX INFO: renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3523ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29154b;

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        ck.p.i(stackTrace, "stackTrace");
        String strA = a(stackTrace, 4);
        String strB = b(stackTrace, 4);
        ck.w wVar = ck.w.f6066a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strA, strB}, 2));
        ck.p.i(str, "format(format, *args)");
        return str;
    }

    public final int a() {
        return this.f29154b;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List listK;
        List listK2;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        ck.p.i(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listK = nj.s.k();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listK = nj.b0.I0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listK = nj.s.k();
            break;
        }
        String[] strArr = (String[]) listK.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (!lk.a0.X(str, "$", false, 2, null)) {
            return str;
        }
        List<String> listSplit2 = new Regex("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listK2 = nj.s.k();
        } else {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listK2 = nj.b0.I0(listSplit2, listIterator2.nextIndex() + 1);
                }
            }
            listK2 = nj.s.k();
        }
        return ((String[]) listK2.toArray(new String[0]))[0];
    }

    public final String c() {
        String str = this.f29153a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f29153a;
    }

    public C3523ib(String str, int i10) {
        this.f29153a = str;
        this.f29154b = i10;
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List listK;
        int i11;
        List listK2;
        List listK3;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        ck.p.i(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listK = nj.b0.I0(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    listK = nj.s.k();
                    break;
                }
            }
        } else {
            listK = nj.s.k();
            break;
        }
        String[] strArr = (String[]) listK.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (lk.a0.X(str, "$", false, 2, null)) {
            List<String> listSplit2 = new Regex("\\$").split(str, 0);
            if (!listSplit2.isEmpty()) {
                ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                while (listIterator2.hasPrevious()) {
                    if (listIterator2.previous().length() != 0) {
                        listK3 = nj.b0.I0(listSplit2, listIterator2.nextIndex() + 1);
                    }
                }
                listK3 = nj.s.k();
            } else {
                listK3 = nj.s.k();
            }
            return ((String[]) listK3.toArray(new String[0]))[1] + "." + stackTraceElementArr[i10].getMethodName();
        }
        String methodName = stackTraceElementArr[i10].getMethodName();
        ck.p.i(methodName, "stackTrace[depth].methodName");
        if (lk.a0.X(methodName, "$", false, 2, null) && stackTraceElementArr.length > (i11 = i10 + 1)) {
            String className2 = stackTraceElementArr[i11].getClassName();
            ck.p.i(className2, "stackTrace[depth + 1]\n                .className");
            List<String> listSplit3 = new Regex("\\$").split(className2, 0);
            if (!listSplit3.isEmpty()) {
                ListIterator<String> listIterator3 = listSplit3.listIterator(listSplit3.size());
                while (true) {
                    if (listIterator3.hasPrevious()) {
                        if (listIterator3.previous().length() != 0) {
                            listK2 = nj.b0.I0(listSplit3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    } else {
                        listK2 = nj.s.k();
                        break;
                    }
                }
            } else {
                listK2 = nj.s.k();
                break;
            }
            String[] strArr2 = (String[]) listK2.toArray(new String[0]);
            if (strArr2.length > 1) {
                return strArr2[1] + "." + stackTraceElementArr[i11].getMethodName();
            }
            String methodName2 = stackTraceElementArr[i11].getMethodName();
            ck.p.i(methodName2, "{\n              stackTra….methodName\n            }");
            return methodName2;
        }
        String methodName3 = stackTraceElementArr[i10].getMethodName();
        ck.p.i(methodName3, "stackTrace[depth].methodName");
        return methodName3;
    }
}
