package androidx.media;

import android.content.Context;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    public android.media.session.MediaSessionManager mObject;

    @RequiresApi(28)
    public static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        public final android.media.session.MediaSessionManager$RemoteUserInfo mObject;

        public RemoteUserInfoImplApi28(String str, int i10, int i11) {
            super(str, i10, i11);
            this.mObject = new android.media.session.MediaSessionManager$RemoteUserInfo(str, i10, i11);
        }

        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
            this.mObject = mediaSessionManager$RemoteUserInfo;
        }

        public static String getPackageName(android.media.session.MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            return mediaSessionManager$RemoteUserInfo.getPackageName();
        }
    }

    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        return super.isTrustedForMediaControl(remoteUserInfoImpl);
    }
}
