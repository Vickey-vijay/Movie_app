package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f16654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f16655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16656c;

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f16656c != null) {
            return true;
        }
        if (!this.f16655b.isEmpty()) {
            this.f16656c = (String) this.f16655b.poll();
            return true;
        }
        do {
            String line = this.f16654a.readLine();
            this.f16656c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f16656c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f16655b = linkedList;
        this.f16654a = bufferedReader;
    }
}
