package com.opensource.svgaplayer;

import bk.a;
import ck.p;
import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mj.r;
import pb.f;
import ub.c;
import yj.b;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmj/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class SVGAParser$decodeFromInputStream$1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SVGAParser f43056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputStream f43057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SVGAParser.c f43059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f43060f;

    public SVGAParser$decodeFromInputStream$1(SVGAParser sVGAParser, InputStream inputStream, String str, SVGAParser.c cVar, boolean z10) {
        this.f43056b = sVGAParser;
        this.f43057c = inputStream;
        this.f43058d = str;
        this.f43059e = cVar;
        this.f43060f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            try {
                byte[] bArrW = this.f43056b.w(this.f43057c);
                if (bArrW == null) {
                    this.f43056b.v(new Exception("readAsBytes(inputStream) cause exception"), this.f43059e);
                } else if (bArrW.length > 4 && bArrW[0] == 80 && bArrW[1] == 75 && bArrW[2] == 3 && bArrW[3] == 4) {
                    c cVar = c.f72796a;
                    cVar.d("SVGAParser", "decode from zip file");
                    SVGACache sVGACache = SVGACache.f43009c;
                    if (!sVGACache.b(this.f43058d).exists() || f.f66126b) {
                        synchronized (Integer.valueOf(f.f66125a)) {
                            if (!sVGACache.b(this.f43058d).exists()) {
                                f.f66126b = true;
                                cVar.d("SVGAParser", "no cached, prepare to unzip");
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrW);
                                try {
                                    this.f43056b.x(byteArrayInputStream, this.f43058d);
                                    f.f66126b = false;
                                    cVar.d("SVGAParser", "unzip success");
                                    r rVar = r.f64562a;
                                    b.a(byteArrayInputStream, null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        b.a(byteArrayInputStream, th2);
                                        throw th3;
                                    }
                                }
                            }
                            r rVar2 = r.f64562a;
                        }
                    }
                    this.f43056b.o(this.f43058d, this.f43059e);
                } else {
                    c.f72796a.d("SVGAParser", "decode from input stream, inflate start");
                    byte[] bArrT = this.f43056b.t(bArrW);
                    if (bArrT != null) {
                        MovieEntity movieEntityF = MovieEntity.ADAPTER.f(bArrT);
                        p.f(movieEntityF, "MovieEntity.ADAPTER.decode(it)");
                        final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityF, new File(this.f43058d), this.f43056b.mFrameWidth, this.f43056b.mFrameHeight);
                        sVGAVideoEntity.t(new a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // bk.a
                            public /* bridge */ /* synthetic */ r invoke() {
                                invoke2();
                                return r.f64562a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                c.f72796a.d("SVGAParser", "decode from input stream, inflate end");
                                SVGAParser$decodeFromInputStream$1 sVGAParser$decodeFromInputStream$1 = this;
                                sVGAParser$decodeFromInputStream$1.f43056b.u(sVGAVideoEntity, sVGAParser$decodeFromInputStream$1.f43059e);
                            }
                        });
                    } else {
                        this.f43056b.v(new Exception("inflate(bytes) cause exception"), this.f43059e);
                    }
                }
                if (!this.f43060f) {
                    return;
                }
            } catch (Exception e10) {
                this.f43056b.v(e10, this.f43059e);
                if (!this.f43060f) {
                    return;
                }
            }
            this.f43057c.close();
        } catch (Throwable th4) {
            if (this.f43060f) {
                this.f43057c.close();
            }
            throw th4;
        }
    }
}
