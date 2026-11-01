package com.unity3d.ads.core.data.datasource;

import ck.i;

/* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class VolumeSettingsChange {

    /* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z10) {
            super(null);
            this.isMuted = z10;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = muteChange.isMuted;
            }
            return muteChange.copy(z10);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean z10) {
            return new MuteChange(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted;
        }

        public int hashCode() {
            boolean z10 = this.isMuted;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }

        public final boolean isMuted() {
            return this.isMuted;
        }
    }

    /* JADX INFO: compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d10) {
            super(null);
            this.volume = d10;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = volumeChange.volume;
            }
            return volumeChange.copy(d10);
        }

        public final double component1() {
            return this.volume;
        }

        public final VolumeChange copy(double d10) {
            return new VolumeChange(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.volume);
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }

        public final double getVolume() {
            return this.volume;
        }
    }

    private VolumeSettingsChange() {
    }

    public /* synthetic */ VolumeSettingsChange(i iVar) {
        this();
    }
}
