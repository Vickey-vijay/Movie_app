package com.opensource.svgaplayer;

import ck.p;
import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mj.r;
import ub.c;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmj/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class SVGAParser$_decodeFromInputStream$1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SVGAParser f43046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputStream f43047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SVGAParser.c f43049e;

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmj/r;", "run", "()V", "com/opensource/svgaplayer/SVGAParser$_decodeFromInputStream$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f43050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SVGAParser$_decodeFromInputStream$1 f43051c;

        public a(byte[] bArr, SVGAParser$_decodeFromInputStream$1 sVGAParser$_decodeFromInputStream$1) {
            this.f43050b = bArr;
            this.f43051c = sVGAParser$_decodeFromInputStream$1;
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            File fileE = SVGACache.f43009c.e(this.f43051c.f43048d);
            File file = fileE.exists() ^ true ? fileE : null;
            if (file != null) {
                file.createNewFile();
            }
            new FileOutputStream(fileE).write(this.f43050b);
        }
    }

    public SVGAParser$_decodeFromInputStream$1(SVGAParser sVGAParser, InputStream inputStream, String str, SVGAParser.c cVar) {
        this.f43046b = sVGAParser;
        this.f43047c = inputStream;
        this.f43048d = str;
        this.f43049e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            try {
                c cVar = c.f72796a;
                cVar.d("SVGAParser", "Input.binary change to entity");
                byte[] bArrW = this.f43046b.w(this.f43047c);
                if (bArrW != null) {
                    SVGAParser.INSTANCE.a().execute(new a(bArrW, this));
                    cVar.d("SVGAParser", "Input.inflate start");
                    byte[] bArrT = this.f43046b.t(bArrW);
                    if (bArrT != null) {
                        cVar.d("SVGAParser", "Input.inflate success");
                        MovieEntity movieEntityF = MovieEntity.ADAPTER.f(bArrT);
                        p.f(movieEntityF, "MovieEntity.ADAPTER.decode(inflateBytes)");
                        final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityF, new File(this.f43048d), this.f43046b.mFrameWidth, this.f43046b.mFrameHeight);
                        sVGAVideoEntity.t(new bk.a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$_decodeFromInputStream$1$$special$$inlined$let$lambda$3
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
                                c.f72796a.d("SVGAParser", "Input.prepare success");
                                SVGAParser$_decodeFromInputStream$1 sVGAParser$_decodeFromInputStream$1 = this;
                                sVGAParser$_decodeFromInputStream$1.f43046b.u(sVGAVideoEntity, sVGAParser$_decodeFromInputStream$1.f43049e);
                            }
                        });
                    } else {
                        this.f43046b.s("Input.inflate(bytes) cause exception", this.f43049e);
                    }
                } else {
                    this.f43046b.s("Input.readAsBytes(inputStream) cause exception", this.f43049e);
                }
            } catch (Exception e10) {
                this.f43046b.v(e10, this.f43049e);
            }
        } finally {
            this.f43047c.close();
        }
    }
}
