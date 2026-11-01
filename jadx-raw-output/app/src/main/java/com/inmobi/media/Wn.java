package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Wn extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f23771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wn(StackTraceElement[] stackTraceElementArr) {
        super("ANRWatchDog", "ANRWatchDogEvent", AbstractC2940il.a(stackTraceElementArr));
        ck.p.j(stackTraceElementArr, "stackTrace");
        this.f23771g = stackTraceElementArr;
    }
}
