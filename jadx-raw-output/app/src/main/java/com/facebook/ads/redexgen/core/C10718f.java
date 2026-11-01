package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10718f {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2654or A07;
    public final boolean A08;
    public final AnonymousClass38[] A09;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, 18, 40, 47, ExifInterface.START_CODE, 40, 63, 35, 38, 46, 11, 63, 46, 35, 37, 30, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, 63, 46, 35, 37, 30, 56, 43, 41, 33, 11, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C10718f(C2654or c2654or, int i10, int i11, int i12, int i13, int i14, int i15, int i16, AnonymousClass38[] anonymousClass38Arr, boolean z10) {
        this.A07 = c2654or;
        this.A01 = i10;
        this.A04 = i11;
        this.A05 = i12;
        this.A06 = i13;
        this.A02 = i14;
        this.A03 = i15;
        this.A00 = i16;
        this.A09 = anonymousClass38Arr;
        this.A08 = z10;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2660oy c2660oy, boolean z10) {
        if (z10) {
            return A00();
        }
        return c2660oy.A01().A00;
    }

    private AudioTrack A02(C2660oy c2660oy, int i10) {
        int iA04 = AbstractC09664a.A04(c2660oy.A05);
        if (i10 != 0) {
            return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1, i10);
        }
        return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z10, C2660oy c2660oy, int i10) {
        if (AbstractC09664a.A02 >= 29) {
            return A05(z10, c2660oy, i10);
        }
        if (AbstractC09664a.A02 >= 21) {
            return A04(z10, c2660oy, i10);
        }
        AudioTrack audioTrackA02 = A02(c2660oy, i10);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return audioTrackA02;
    }

    private AudioTrack A04(boolean z10, C2660oy c2660oy, int i10) {
        return new AudioTrack(A01(c2660oy, z10), C2538mw.A0D(this.A06, this.A02, this.A03), this.A00, 1, i10);
    }

    private AudioTrack A05(boolean z10, C2660oy c2660oy, int i10) {
        AudioFormat audioFormatA0D = C2538mw.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2660oy, z10);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(audioFormatA0D);
        boolean z11 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i10);
        if (this.A04 != 1) {
            z11 = false;
        }
        AudioTrack audioTrackBuild = sessionId.setOffloadedPlayback(z11).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return audioTrackBuild;
    }

    public final long A08(long j10) {
        return (1000000 * j10) / ((long) this.A06);
    }

    public final long A09(long j10) {
        return (1000000 * j10) / ((long) this.A07.A0G);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z10, C2660oy c2660oy, int i10) throws C8H {
        try {
            AudioTrack audioTrackA03 = A03(z10, c2660oy, i10);
            C2538mw.A0M().incrementAndGet();
            int state = audioTrackA03.getState();
            if (state == 1) {
                return audioTrackA03;
            }
            try {
                audioTrackA03.release();
                C2538mw.A0M().decrementAndGet();
            } catch (Exception e10) {
                AnonymousClass44.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C2538mw.A0M().get())), e10);
            }
            throw new C8H(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C2538mw.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e11) {
            throw new C8H(0, this.A06, this.A02, this.A00, this.A07, A0D(), e11, C2538mw.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8F] */
    public final C8F A0B() {
        final int i10 = this.A03;
        final int i11 = this.A06;
        final int i12 = this.A02;
        final boolean z10 = this.A08;
        final boolean z11 = this.A04 == 1;
        final int i13 = this.A00;
        return new Object(i10, i11, i12, z10, z11, i13) { // from class: com.facebook.ads.redexgen.X.8F
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i10;
                this.A03 = i11;
                this.A01 = i12;
                this.A05 = z10;
                this.A04 = z11;
                this.A00 = i13;
            }
        };
    }

    public final C10718f A0C(int i10) {
        return new C10718f(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i10, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C10718f c10718f) {
        return c10718f.A04 == this.A04 && c10718f.A03 == this.A03 && c10718f.A06 == this.A06 && c10718f.A02 == this.A02 && c10718f.A05 == this.A05;
    }
}
