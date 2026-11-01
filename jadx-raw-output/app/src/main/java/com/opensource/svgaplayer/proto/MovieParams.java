package com.opensource.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import ic.c;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes8.dex */
public final class MovieParams extends Message<MovieParams, a> {
    public static final ProtoAdapter<MovieParams> ADAPTER = new b();
    public static final Integer DEFAULT_FPS;
    public static final Integer DEFAULT_FRAMES;
    public static final Float DEFAULT_VIEWBOXHEIGHT;
    public static final Float DEFAULT_VIEWBOXWIDTH;
    private static final long serialVersionUID = 0;
    public final Integer fps;
    public final Integer frames;
    public final Float viewBoxHeight;
    public final Float viewBoxWidth;

    public static final class a extends Message.a<MovieParams, a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f43117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f43118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f43119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f43120g;

        @Override // com.squareup.wire.Message.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public MovieParams c() {
            return new MovieParams(this.f43117d, this.f43118e, this.f43119f, this.f43120g, super.d());
        }

        public a h(Integer num) {
            this.f43119f = num;
            return this;
        }

        public a i(Integer num) {
            this.f43120g = num;
            return this;
        }

        public a j(Float f10) {
            this.f43118e = f10;
            return this;
        }

        public a k(Float f10) {
            this.f43117d = f10;
            return this;
        }
    }

    public static final class b extends ProtoAdapter<MovieParams> {
        public b() {
            super(FieldEncoding.LENGTH_DELIMITED, MovieParams.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public MovieParams c(ic.b bVar) throws IOException {
            a aVar = new a();
            long jC = bVar.c();
            while (true) {
                int iF = bVar.f();
                if (iF == -1) {
                    bVar.d(jC);
                    return aVar.c();
                }
                if (iF == 1) {
                    aVar.k(ProtoAdapter.f45191o.c(bVar));
                } else if (iF == 2) {
                    aVar.j(ProtoAdapter.f45191o.c(bVar));
                } else if (iF == 3) {
                    aVar.h(ProtoAdapter.f45181e.c(bVar));
                } else if (iF != 4) {
                    FieldEncoding fieldEncodingG = bVar.g();
                    aVar.a(iF, fieldEncodingG, fieldEncodingG.rawProtoAdapter().c(bVar));
                } else {
                    aVar.i(ProtoAdapter.f45181e.c(bVar));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void g(c cVar, MovieParams movieParams) throws IOException {
            Float f10 = movieParams.viewBoxWidth;
            if (f10 != null) {
                ProtoAdapter.f45191o.k(cVar, 1, f10);
            }
            Float f11 = movieParams.viewBoxHeight;
            if (f11 != null) {
                ProtoAdapter.f45191o.k(cVar, 2, f11);
            }
            Integer num = movieParams.fps;
            if (num != null) {
                ProtoAdapter.f45181e.k(cVar, 3, num);
            }
            Integer num2 = movieParams.frames;
            if (num2 != null) {
                ProtoAdapter.f45181e.k(cVar, 4, num2);
            }
            cVar.k(movieParams.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int l(MovieParams movieParams) {
            Float f10 = movieParams.viewBoxWidth;
            int iM = f10 != null ? ProtoAdapter.f45191o.m(1, f10) : 0;
            Float f11 = movieParams.viewBoxHeight;
            int iM2 = iM + (f11 != null ? ProtoAdapter.f45191o.m(2, f11) : 0);
            Integer num = movieParams.fps;
            int iM3 = iM2 + (num != null ? ProtoAdapter.f45181e.m(3, num) : 0);
            Integer num2 = movieParams.frames;
            return iM3 + (num2 != null ? ProtoAdapter.f45181e.m(4, num2) : 0) + movieParams.unknownFields().size();
        }
    }

    public MovieParams(Float f10, Float f11, Integer num, Integer num2) {
        this(f10, f11, num, num2, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieParams)) {
            return false;
        }
        MovieParams movieParams = (MovieParams) obj;
        return unknownFields().equals(movieParams.unknownFields()) && com.squareup.wire.internal.a.d(this.viewBoxWidth, movieParams.viewBoxWidth) && com.squareup.wire.internal.a.d(this.viewBoxHeight, movieParams.viewBoxHeight) && com.squareup.wire.internal.a.d(this.fps, movieParams.fps) && com.squareup.wire.internal.a.d(this.frames, movieParams.frames);
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_VIEWBOXWIDTH = fValueOf;
        DEFAULT_VIEWBOXHEIGHT = fValueOf;
        DEFAULT_FPS = 0;
        DEFAULT_FRAMES = 0;
    }

    public MovieParams(Float f10, Float f11, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.viewBoxWidth = f10;
        this.viewBoxHeight = f11;
        this.fps = num;
        this.frames = num2;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f10 = this.viewBoxWidth;
        int iHashCode2 = (iHashCode + (f10 != null ? f10.hashCode() : 0)) * 37;
        Float f11 = this.viewBoxHeight;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Integer num = this.fps;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.frames;
        int iHashCode5 = iHashCode4 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public a newBuilder() {
        a aVar = new a();
        aVar.f43117d = this.viewBoxWidth;
        aVar.f43118e = this.viewBoxHeight;
        aVar.f43119f = this.fps;
        aVar.f43120g = this.frames;
        aVar.b(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.viewBoxWidth != null) {
            sb2.append(", viewBoxWidth=");
            sb2.append(this.viewBoxWidth);
        }
        if (this.viewBoxHeight != null) {
            sb2.append(", viewBoxHeight=");
            sb2.append(this.viewBoxHeight);
        }
        if (this.fps != null) {
            sb2.append(", fps=");
            sb2.append(this.fps);
        }
        if (this.frames != null) {
            sb2.append(", frames=");
            sb2.append(this.frames);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "MovieParams{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
