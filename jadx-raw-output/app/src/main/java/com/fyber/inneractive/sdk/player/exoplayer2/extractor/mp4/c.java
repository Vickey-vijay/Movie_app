package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f16825l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f16827m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f16829n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f16831o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f16833p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f16835q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f16837r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f16839s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f16841t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f16843u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f16845v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f16847w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f16849x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f16851y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f16853z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16804b = z.a("ftyp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16806c = z.a("avc1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16808d = z.a("avc3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16810e = z.a("hvc1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16812f = z.a("hev1");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16814g = z.a("s263");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16816h = z.a("d263");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f16818i = z.a("mdat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16820j = z.a("mp4a");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f16822k = z.a(".mp3");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f16824l = z.a("wave");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f16826m = z.a("lpcm");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f16828n = z.a("sowt");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f16830o = z.a("ac-3");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f16832p = z.a("dac3");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f16834q = z.a("ec-3");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f16836r = z.a("dec3");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f16838s = z.a("dtsc");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f16840t = z.a("dtsh");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f16842u = z.a("dtsl");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f16844v = z.a("dtse");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f16846w = z.a("ddts");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f16848x = z.a("tfdt");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f16850y = z.a("tfhd");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f16852z = z.a("trex");
    public static final int A = z.a("trun");
    public static final int B = z.a("sidx");
    public static final int C = z.a("moov");
    public static final int D = z.a("mvhd");
    public static final int E = z.a("trak");
    public static final int F = z.a("mdia");
    public static final int G = z.a("minf");
    public static final int H = z.a("stbl");
    public static final int I = z.a("avcC");
    public static final int J = z.a("hvcC");
    public static final int K = z.a("esds");
    public static final int L = z.a("moof");
    public static final int M = z.a("traf");
    public static final int N = z.a("mvex");
    public static final int O = z.a("mehd");
    public static final int P = z.a("tkhd");
    public static final int Q = z.a("edts");
    public static final int R = z.a("elst");
    public static final int S = z.a("mdhd");
    public static final int T = z.a("hdlr");
    public static final int U = z.a("stsd");
    public static final int V = z.a("pssh");
    public static final int W = z.a("sinf");
    public static final int X = z.a("schm");
    public static final int Y = z.a("schi");
    public static final int Z = z.a("tenc");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f16803a0 = z.a("encv");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f16805b0 = z.a("enca");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f16807c0 = z.a("frma");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f16809d0 = z.a("saiz");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f16811e0 = z.a("saio");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f16813f0 = z.a("sbgp");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f16815g0 = z.a("sgpd");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f16817h0 = z.a(CommonUrlParts.UUID);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f16819i0 = z.a("senc");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f16821j0 = z.a("pasp");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f16823k0 = z.a("TTML");

    static {
        z.a("vmhd");
        f16825l0 = z.a("mp4v");
        f16827m0 = z.a("stts");
        f16829n0 = z.a("stss");
        f16831o0 = z.a("ctts");
        f16833p0 = z.a("stsc");
        f16835q0 = z.a("stsz");
        f16837r0 = z.a("stz2");
        f16839s0 = z.a("stco");
        f16841t0 = z.a("co64");
        f16843u0 = z.a("tx3g");
        f16845v0 = z.a("wvtt");
        f16847w0 = z.a("stpp");
        f16849x0 = z.a("c608");
        f16851y0 = z.a("samr");
        f16853z0 = z.a("sawb");
        A0 = z.a("udta");
        B0 = z.a("meta");
        C0 = z.a("ilst");
        D0 = z.a("mean");
        E0 = z.a("name");
        F0 = z.a("data");
        G0 = z.a("emsg");
        H0 = z.a("st3d");
        I0 = z.a("sv3d");
        J0 = z.a("proj");
        K0 = z.a("vp08");
        L0 = z.a("vp09");
        M0 = z.a("vpcC");
        N0 = z.a("camm");
        O0 = z.a("alac");
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f16854a);
    }

    public c(int i10) {
        this.f16854a = i10;
    }
}
