package com.opensource.svgaplayer;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Y5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.opensource.svgaplayer.proto.AudioEntity;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.opensource.svgaplayer.proto.MovieParams;
import com.opensource.svgaplayer.proto.SpriteEntity;
import ik.i;
import ik.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import lk.x;
import mj.r;
import nj.b0;
import nj.n;
import nj.s;
import nj.t;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;
import qb.d;
import sb.f;
import tb.c;

/* JADX INFO: compiled from: SVGAVideoEntity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010g\u001a\u00020!\u0012\u0006\u0010h\u001a\u00020E\u0012\u0006\u0010i\u001a\u00020E¢\u0006\u0004\bj\u0010kB)\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010g\u001a\u00020!\u0012\u0006\u0010h\u001a\u00020E\u0012\u0006\u0010i\u001a\u00020E¢\u0006\u0004\bj\u0010lJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u001e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J$\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!0 H\u0002J\u0018\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150 2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u001e\u0010*\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J\u0018\u0010-\u001a\n ,*\u0004\u0018\u00010+0+2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u001d\u0010/\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0000¢\u0006\u0004\b/\u00100J\u0006\u00101\u001a\u00020\u0004R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010D\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020E2\u0006\u0010@\u001a\u00020E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010F\u001a\u0004\bG\u0010HR$\u0010K\u001a\u00020E2\u0006\u0010@\u001a\u00020E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010F\u001a\u0004\bJ\u0010HR(\u0010S\u001a\b\u0012\u0004\u0012\u00020M0L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010V\u001a\b\u0012\u0004\u0012\u00020#0L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR$\u0010\\\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R.\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010cR\u0016\u0010e\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010FR\u0016\u0010f\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010F¨\u0006m"}, d2 = {"Lcom/opensource/svgaplayer/SVGAVideoEntity;", "", "Lorg/json/JSONObject;", "movieObject", "Lmj/r;", VastAttributes.VERTICAL_POSITION, "Lcom/opensource/svgaplayer/proto/MovieParams;", "movieParams", "z", "json", "s", "", "imgName", "imgKey", "h", Y5.c.f27929c, "Landroid/graphics/Bitmap;", "b", "Lcom/opensource/svgaplayer/proto/MovieEntity;", IconCompat.EXTRA_OBJ, "r", "", "byteArray", "c", "v", "entity", "u", "Lkotlin/Function0;", "completionBlock", VastAttributes.HORIZONTAL_POSITION, "Lcom/opensource/svgaplayer/proto/AudioEntity;", "audio", "Ljava/util/HashMap;", "Ljava/io/File;", "audiosFileMap", "Lsb/a;", "d", "audioCache", "value", "e", InneractiveMediationDefs.GENDER_FEMALE, "g", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/media/SoundPool;", "kotlin.jvm.PlatformType", "i", "callback", "t", "(Lbk/a;)V", "a", "", "Z", "j", "()Z", "w", "(Z)V", "antiAlias", "Lcom/opensource/svgaplayer/proto/MovieEntity;", "getMovieItem", "()Lcom/opensource/svgaplayer/proto/MovieEntity;", "setMovieItem", "(Lcom/opensource/svgaplayer/proto/MovieEntity;)V", "movieItem", "Ltb/c;", "<set-?>", "Ltb/c;", "q", "()Ltb/c;", "videoSize", "", "I", "l", "()I", "FPS", InneractiveMediationDefs.GENDER_MALE, b.JSON_KEY_FRAME_ADS, "", "Lsb/f;", "Ljava/util/List;", "p", "()Ljava/util/List;", "setSpriteList$com_opensource_svgaplayer", "(Ljava/util/List;)V", "spriteList", CampaignEx.JSON_KEY_AD_K, "setAudioList$com_opensource_svgaplayer", "audioList", "Landroid/media/SoundPool;", "o", "()Landroid/media/SoundPool;", "setSoundPool$com_opensource_svgaplayer", "(Landroid/media/SoundPool;)V", "soundPool", "Ljava/util/HashMap;", "n", "()Ljava/util/HashMap;", "setImageMap$com_opensource_svgaplayer", "(Ljava/util/HashMap;)V", "imageMap", "Ljava/io/File;", "mCacheDir", "mFrameHeight", "mFrameWidth", "cacheDir", "frameWidth", "frameHeight", "<init>", "(Lorg/json/JSONObject;Ljava/io/File;II)V", "(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;II)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class SVGAVideoEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean antiAlias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MovieEntity movieItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c videoSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int FPS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int frames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public List<f> spriteList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public List<sb.a> audioList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public SoundPool soundPool;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public HashMap<String, Bitmap> imageMap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public File mCacheDir;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int mFrameHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mFrameWidth;

    /* JADX INFO: compiled from: SVGAVideoEntity.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/media/SoundPool;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "Lmj/r;", "onLoadComplete", "(Landroid/media/SoundPool;II)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f43079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MovieEntity f43080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bk.a f43081c;

        public a(Ref$IntRef ref$IntRef, MovieEntity movieEntity, bk.a aVar) {
            this.f43079a = ref$IntRef;
            this.f43080b = movieEntity;
            this.f43081c = aVar;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
            Ref$IntRef ref$IntRef = this.f43079a;
            int i12 = ref$IntRef.element + 1;
            ref$IntRef.element = i12;
            List<AudioEntity> list = this.f43080b.audios;
            p.f(list, "entity.audios");
            if (i12 >= list.size()) {
                this.f43081c.invoke();
            }
        }
    }

    public SVGAVideoEntity(JSONObject jSONObject, File file, int i10, int i11) {
        p.k(jSONObject, "json");
        p.k(file, "cacheDir");
        this.antiAlias = true;
        this.videoSize = new c(0.0d, 0.0d, 0.0d, 0.0d);
        this.FPS = 15;
        this.spriteList = s.k();
        this.audioList = s.k();
        this.imageMap = new HashMap<>();
        this.mFrameWidth = i10;
        this.mFrameHeight = i11;
        this.mCacheDir = file;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("movie");
        if (jSONObjectOptJSONObject != null) {
            y(jSONObjectOptJSONObject);
            try {
                s(jSONObject);
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (OutOfMemoryError e11) {
                e11.printStackTrace();
            }
            v(jSONObject);
        }
    }

    public final void A(MovieEntity movieEntity, bk.a<r> aVar) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        SoundPool soundPoolI = i(movieEntity);
        this.soundPool = soundPoolI;
        if (soundPoolI != null) {
            soundPoolI.setOnLoadCompleteListener(new a(ref$IntRef, movieEntity, aVar));
        }
    }

    public final void a() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
        this.soundPool = null;
        this.audioList = s.k();
        this.spriteList = s.k();
        this.imageMap.clear();
    }

    public final Bitmap b(String filePath) {
        return d.f66563a.a(filePath, this.mFrameWidth, this.mFrameHeight);
    }

    public final Bitmap c(byte[] byteArray, String filePath) {
        Bitmap bitmapA = qb.b.f66562a.a(byteArray, this.mFrameWidth, this.mFrameHeight);
        return bitmapA != null ? bitmapA : b(filePath);
    }

    public final sb.a d(AudioEntity audio, HashMap<String, File> audiosFileMap) throws IOException {
        sb.a aVar = new sb.a(audio);
        Integer num = audio.startTime;
        double dIntValue = num != null ? num.intValue() : 0;
        Integer num2 = audio.totalTime;
        double dIntValue2 = num2 != null ? num2.intValue() : 0;
        if (((int) dIntValue2) == 0) {
            return aVar;
        }
        File file = audiosFileMap.get(audio.audioKey);
        if (file != null) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                double dAvailable = fileInputStream.available();
                long j10 = (long) ((dIntValue / dIntValue2) * dAvailable);
                try {
                    SoundPool soundPool = this.soundPool;
                    aVar.f(soundPool != null ? Integer.valueOf(soundPool.load(fileInputStream.getFD(), j10, (long) dAvailable, 1)) : null);
                    r rVar = r.f64562a;
                    yj.b.a(fileInputStream, null);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        yj.b.a(fileInputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return aVar;
    }

    public final HashMap<String, byte[]> g(MovieEntity entity) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        HashMap<String, byte[]> map = new HashMap<>();
        Map<String, ByteString> map2 = entity.images;
        if (map2 != null && (setEntrySet = map2.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
                p.f(byteArray, "byteArray");
                if (byteArray.length >= 4) {
                    List<Byte> listI0 = n.i0(byteArray, new i(0, 3));
                    if (listI0.get(0).byteValue() == 73 && listI0.get(1).byteValue() == 68 && listI0.get(2).byteValue() == 51) {
                        p.f(str, "imageKey");
                        map.put(str, byteArray);
                    }
                }
            }
        }
        return map;
    }

    public final String h(String imgName, String imgKey) {
        String str = this.mCacheDir.getAbsolutePath() + "/" + imgName;
        String str2 = str + ".png";
        String str3 = this.mCacheDir.getAbsolutePath() + "/" + imgKey + ".png";
        if (new File(str).exists()) {
            return str;
        }
        if (new File(str2).exists()) {
            return str2;
        }
        return new File(str3).exists() ? str3 : "";
    }

    public final SoundPool i(MovieEntity entity) {
        SoundPool.Builder audioAttributes = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build());
        List<AudioEntity> list = entity.audios;
        p.f(list, "entity.audios");
        return audioAttributes.setMaxStreams(k.g(12, list.size())).build();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    public final List<sb.a> k() {
        return this.audioList;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getFPS() {
        return this.FPS;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getFrames() {
        return this.frames;
    }

    public final HashMap<String, Bitmap> n() {
        return this.imageMap;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final SoundPool getSoundPool() {
        return this.soundPool;
    }

    public final List<f> p() {
        return this.spriteList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c getVideoSize() {
        return this.videoSize;
    }

    public final void r(MovieEntity movieEntity) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Map<String, ByteString> map = movieEntity.images;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
            p.f(byteArray, "byteArray");
            if (byteArray.length >= 4) {
                List<Byte> listI0 = n.i0(byteArray, new i(0, 3));
                if (listI0.get(0).byteValue() != 73 || listI0.get(1).byteValue() != 68 || listI0.get(2).byteValue() != 51) {
                    String strUtf8 = ((ByteString) entry.getValue()).utf8();
                    p.f(strUtf8, "entry.value.utf8()");
                    Object key = entry.getKey();
                    p.f(key, "entry.key");
                    Bitmap bitmapC = c(byteArray, h(strUtf8, (String) key));
                    if (bitmapC != null) {
                        HashMap<String, Bitmap> map2 = this.imageMap;
                        Object key2 = entry.getKey();
                        p.f(key2, "entry.key");
                        map2.put((String) key2, bitmapC);
                    }
                }
            }
        }
    }

    public final void s(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("images");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            p.f(itKeys, "imgJson.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObjectOptJSONObject.get(next).toString();
                p.f(next, "imgKey");
                String strH = h(string, next);
                if (strH.length() == 0) {
                    return;
                }
                String strN = x.N(next, ".matte", "", false, 4, null);
                Bitmap bitmapB = b(strH);
                if (bitmapB != null) {
                    this.imageMap.put(strN, bitmapB);
                }
            }
        }
    }

    public final void t(final bk.a<r> callback) throws IOException {
        p.k(callback, "callback");
        MovieEntity movieEntity = this.movieItem;
        if (movieEntity == null) {
            callback.invoke();
            return;
        }
        if (movieEntity == null) {
            p.v();
        }
        x(movieEntity, new bk.a<r>() { // from class: com.opensource.svgaplayer.SVGAVideoEntity$prepare$1
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
                callback.invoke();
            }
        });
    }

    public final void u(MovieEntity movieEntity) {
        List<f> listK;
        List<SpriteEntity> list = movieEntity.sprites;
        if (list != null) {
            listK = new ArrayList<>(t.v(list, 10));
            for (SpriteEntity spriteEntity : list) {
                p.f(spriteEntity, "it");
                listK.add(new f(spriteEntity));
            }
        } else {
            listK = s.k();
        }
        this.spriteList = listK;
    }

    public final void v(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sprites");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new f(jSONObjectOptJSONObject));
                }
            }
        }
        this.spriteList = b0.O0(arrayList);
    }

    public final void w(boolean z10) {
        this.antiAlias = z10;
    }

    public final void x(MovieEntity movieEntity, bk.a<r> aVar) throws IOException {
        List<AudioEntity> list = movieEntity.audios;
        if (list == null || list.isEmpty()) {
            aVar.invoke();
            return;
        }
        A(movieEntity, aVar);
        HashMap<String, File> mapF = f(movieEntity);
        List<AudioEntity> list2 = movieEntity.audios;
        ArrayList arrayList = new ArrayList(t.v(list2, 10));
        for (AudioEntity audioEntity : list2) {
            p.f(audioEntity, "audio");
            arrayList.add(d(audioEntity, mapF));
        }
        this.audioList = arrayList;
    }

    public final void z(MovieParams movieParams) {
        Float f10 = movieParams.viewBoxWidth;
        double dFloatValue = f10 != null ? f10.floatValue() : 0.0f;
        Float f11 = movieParams.viewBoxHeight;
        this.videoSize = new c(0.0d, 0.0d, dFloatValue, f11 != null ? f11.floatValue() : 0.0f);
        Integer num = movieParams.fps;
        this.FPS = num != null ? num.intValue() : 20;
        Integer num2 = movieParams.frames;
        this.frames = num2 != null ? num2.intValue() : 0;
    }

    public final File e(File audioCache, byte[] value) throws IOException {
        audioCache.createNewFile();
        new FileOutputStream(audioCache).write(value);
        return audioCache;
    }

    public final HashMap<String, File> f(MovieEntity entity) throws IOException {
        File fileE;
        HashMap<String, byte[]> mapG = g(entity);
        HashMap<String, File> map = new HashMap<>();
        if (mapG.size() > 0) {
            for (Map.Entry<String, byte[]> entry : mapG.entrySet()) {
                File fileA = SVGACache.f43009c.a(entry.getKey());
                String key = entry.getKey();
                if (fileA.exists()) {
                    fileE = fileA;
                } else {
                    fileE = null;
                }
                if (fileE == null) {
                    fileE = e(fileA, entry.getValue());
                }
                map.put(key, fileE);
            }
        }
        return map;
    }

    public final void y(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("viewBox");
        if (jSONObjectOptJSONObject != null) {
            this.videoSize = new c(0.0d, 0.0d, jSONObjectOptJSONObject.optDouble("width", 0.0d), jSONObjectOptJSONObject.optDouble("height", 0.0d));
        }
        this.FPS = jSONObject.optInt("fps", 20);
        this.frames = jSONObject.optInt(b.JSON_KEY_FRAME_ADS, 0);
    }

    public SVGAVideoEntity(MovieEntity movieEntity, File file, int i10, int i11) {
        p.k(movieEntity, "entity");
        p.k(file, "cacheDir");
        this.antiAlias = true;
        this.videoSize = new c(0.0d, 0.0d, 0.0d, 0.0d);
        this.FPS = 15;
        this.spriteList = s.k();
        this.audioList = s.k();
        this.imageMap = new HashMap<>();
        this.mFrameWidth = i10;
        this.mFrameHeight = i11;
        this.mCacheDir = file;
        this.movieItem = movieEntity;
        MovieParams movieParams = movieEntity.params;
        if (movieParams != null) {
            z(movieParams);
        }
        try {
            r(movieEntity);
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
        u(movieEntity);
    }
}
