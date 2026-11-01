package io.bidmachine.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.UnstableApi;
import p5.f;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4TimestampData> CREATOR = new a();
    public static final int TIMESCALE_UNSET = -1;
    private static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public class a implements Parcelable.Creator<Mp4TimestampData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4TimestampData createFromParcel(Parcel parcel) {
            return new Mp4TimestampData(parcel, (a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4TimestampData[] newArray(int i10) {
            return new Mp4TimestampData[i10];
        }
    }

    public /* synthetic */ Mp4TimestampData(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ Format getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        super.populateMediaMetadata(builder);
    }

    public Mp4TimestampData(long j10, long j11) {
        this.creationTimestampSeconds = j10;
        this.modificationTimestampSeconds = j11;
        this.timescale = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j10) {
        return (j10 / 1000) + 2082844800;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + f.b(this.creationTimestampSeconds)) * 31) + f.b(this.modificationTimestampSeconds)) * 31) + f.b(this.timescale);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.creationTimestampSeconds);
        parcel.writeLong(this.modificationTimestampSeconds);
        parcel.writeLong(this.timescale);
    }

    public Mp4TimestampData(long j10, long j11, long j12) {
        this.creationTimestampSeconds = j10;
        this.modificationTimestampSeconds = j11;
        this.timescale = j12;
    }

    private Mp4TimestampData(Parcel parcel) {
        this.creationTimestampSeconds = parcel.readLong();
        this.modificationTimestampSeconds = parcel.readLong();
        this.timescale = parcel.readLong();
    }
}
