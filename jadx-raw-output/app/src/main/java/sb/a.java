package sb;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.opensource.svgaplayer.proto.AudioEntity;
import kotlin.Metadata;

/* JADX INFO: compiled from: SVGAAudioEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0015\u0010\u0018R$\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0012\u0010\u0018¨\u0006 "}, d2 = {"Lsb/a;", "", "", "a", "Ljava/lang/String;", "getAudioKey", "()Ljava/lang/String;", "audioKey", "", "b", "I", "d", "()I", "startFrame", "c", "endFrame", "getStartTime", "startTime", "e", "getTotalTime", "totalTime", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "soundID", "g", "playID", "Lcom/opensource/svgaplayer/proto/AudioEntity;", "audioItem", "<init>", "(Lcom/opensource/svgaplayer/proto/AudioEntity;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String audioKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int startFrame;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int endFrame;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int startTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int totalTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Integer soundID;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Integer playID;

    public a(AudioEntity audioEntity) {
        p.k(audioEntity, "audioItem");
        this.audioKey = audioEntity.audioKey;
        Integer num = audioEntity.startFrame;
        this.startFrame = num != null ? num.intValue() : 0;
        Integer num2 = audioEntity.endFrame;
        this.endFrame = num2 != null ? num2.intValue() : 0;
        Integer num3 = audioEntity.startTime;
        this.startTime = num3 != null ? num3.intValue() : 0;
        Integer num4 = audioEntity.totalTime;
        this.totalTime = num4 != null ? num4.intValue() : 0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndFrame() {
        return this.endFrame;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getPlayID() {
        return this.playID;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getSoundID() {
        return this.soundID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartFrame() {
        return this.startFrame;
    }

    public final void e(Integer num) {
        this.playID = num;
    }

    public final void f(Integer num) {
        this.soundID = num;
    }
}
