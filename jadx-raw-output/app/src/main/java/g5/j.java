package g5;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f53099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f53101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f53102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final a f53103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Metadata f53104l;

    public j(byte[] bArr, int i10) {
        s sVar = new s(bArr);
        sVar.o(i10 * 8);
        this.f53093a = sVar.h(16);
        this.f53094b = sVar.h(16);
        this.f53095c = sVar.h(24);
        this.f53096d = sVar.h(24);
        int iH = sVar.h(20);
        this.f53097e = iH;
        this.f53098f = l(iH);
        this.f53099g = sVar.h(3) + 1;
        int iH2 = sVar.h(5) + 1;
        this.f53100h = iH2;
        this.f53101i = g(iH2);
        this.f53102j = sVar.j(36);
        this.f53103k = null;
        this.f53104l = null;
    }

    public static int g(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int l(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f53105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f53106b;

        public a(long[] jArr, long[] jArr2) {
            this.f53105a = jArr;
            this.f53106b = jArr2;
        }
    }

    public j c(@Nullable a aVar) {
        return new j(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53099g, this.f53100h, this.f53102j, aVar, this.f53104l);
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f53096d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f53095c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f53093a;
            j10 = ((((i11 != this.f53094b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f53099g)) * ((long) this.f53100h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int f() {
        return this.f53100h * this.f53097e * this.f53099g;
    }

    public long h() {
        long j10 = this.f53102j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f53097e);
    }

    public Format i(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f53096d;
        if (i10 <= 0) {
            i10 = -1;
        }
        Metadata metadataJ = j(metadata);
        return Format.n(null, "audio/flac", null, f(), i10, this.f53099g, this.f53097e, -1, 0, 0, Collections.singletonList(bArr), null, 0, null, metadataJ);
    }

    @Nullable
    public Metadata j(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f53104l;
        return metadata2 == null ? metadata : metadata2.b(metadata);
    }

    public long k(long j10) {
        return k0.r((j10 * ((long) this.f53097e)) / 1000000, 0L, this.f53102j - 1);
    }

    @Nullable
    public static Metadata a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrE0 = k0.E0(str, "=");
            if (strArrE0.length != 2) {
                m.h("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new VorbisComment(strArrE0[0], strArrE0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public j b(List<PictureFrame> list) {
        return new j(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53099g, this.f53100h, this.f53102j, this.f53103k, j(a(Collections.emptyList(), list)));
    }

    public j d(List<String> list) {
        return new j(this.f53093a, this.f53094b, this.f53095c, this.f53096d, this.f53097e, this.f53099g, this.f53100h, this.f53102j, this.f53103k, j(a(list, Collections.emptyList())));
    }

    public j(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable a aVar, @Nullable Metadata metadata) {
        this.f53093a = i10;
        this.f53094b = i11;
        this.f53095c = i12;
        this.f53096d = i13;
        this.f53097e = i14;
        this.f53098f = l(i14);
        this.f53099g = i15;
        this.f53100h = i16;
        this.f53101i = g(i16);
        this.f53102j = j10;
        this.f53103k = aVar;
        this.f53104l = metadata;
    }
}
