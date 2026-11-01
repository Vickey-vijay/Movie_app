package com.unity3d.ads.core.domain;

import ck.i;
import ck.p;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.h;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", l = {15}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(c<? super Map<String, ? extends Object>> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidGetAdPlayerContext androidGetAdPlayerContext;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objStaticDeviceInfo = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objStaticDeviceInfo);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == objF) {
                return objF;
            }
            androidGetAdPlayerContext = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidGetAdPlayerContext = (AndroidGetAdPlayerContext) anonymousClass1.L$0;
            kotlin.c.b(objStaticDeviceInfo);
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
        String gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return kotlin.collections.a.m(h.a("bundleId", staticDeviceInfo.getBundleId()), h.a("bundleVersion", staticDeviceInfo.getBundleVersion()), h.a("webviewHash", "unknown"), h.a("sdkVersion", tj.a.d(SdkProperties.getVersionCode())), h.a("sdkVersionName", SdkProperties.getVersionName()), h.a("osVersion", staticDeviceInfo.getOsVersion()), h.a("systemLanguage", Locale.getDefault().toString()), h.a("deviceModel", staticDeviceInfo.getDeviceModel()), h.a("limitAdTracking", tj.a.a(dynamicDeviceInfo.getLimitedTracking())), h.a("maxVolume", tj.a.b(dynamicDeviceInfo.getAndroid().getMaxVolume())), h.a("gameId", gameId));
    }
}
