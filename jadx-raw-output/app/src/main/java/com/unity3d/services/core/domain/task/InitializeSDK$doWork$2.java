package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ResultExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.k0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
public final class InitializeSDK$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, c<? super InitializeSDK$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, cVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super Result<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super Result<r>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super Result<r>> cVar) {
        return ((InitializeSDK$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x02aa A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x02c9 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f9 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x030b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x0328 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:126:0x0333 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0350  */
    /* JADX WARN: Code duplicated, block: B:133:0x0355  */
    /* JADX WARN: Code duplicated, block: B:135:0x035b  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0159 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x019f A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x021d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0224 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x023c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0244 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0250 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x025b A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0265 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0159, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Throwable thM3461exceptionOrNullimpl;
        l0 l0Var;
        InitializeSDK initializeSDK;
        Object objMo3177invokegIAlus;
        InitializeSDK initializeSDK2;
        Throwable thM3461exceptionOrNullimpl2;
        Configuration configuration;
        Configuration configuration2;
        Object objMo3177invokegIAlus2;
        Object objMo3177invokegIAlus3;
        ErrorState errorState;
        Throwable thM3461exceptionOrNullimpl3;
        Object obj2;
        Throwable thM3461exceptionOrNullimpl4;
        l0 l0Var2;
        InitializeSDK initializeSDK3;
        Object obj3;
        InitializationException initializationExceptionOrThrow;
        Object objMo3177invokegIAlus4;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        String webViewData;
        Object objMo3177invokegIAlus5;
        ErrorState errorState2;
        Throwable thM3461exceptionOrNullimpl5;
        Object obj4;
        Throwable thM3461exceptionOrNullimpl6;
        Object obj5;
        InitializationException initializationExceptionOrThrow2;
        Object objMo3177invokegIAlus6;
        Object obj6;
        InitializeSDK initializeSDK4;
        InitializationException initializationExceptionOrThrow3;
        Object objMo3177invokegIAlus7;
        Object objF = a.f();
        try {
            switch (this.label) {
                case 0:
                    kotlin.c.b(obj);
                    l0Var = (l0) this.L$0;
                    initializeSDK = this.this$0;
                    Result.a aVar = Result.Companion;
                    SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                    SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                    InitializeEventsMetricSender.getInstance().didInitStart();
                    if (ClientProperties.getGameId() == null) {
                        InitializationException initializationException = new InitializationException(ErrorState.InvalidGameId, new Exception("gameId is null."), new Configuration());
                        this.L$0 = l0Var;
                        this.L$1 = initializeSDK;
                        this.label = 1;
                        if (initializeSDK.handleInitializationException(initializationException, this) == objF) {
                            return objF;
                        }
                    }
                    DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    ConfigFileFromLocalStorage configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                    ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = l0Var;
                    this.L$1 = initializeSDK;
                    this.label = 2;
                    objMo3177invokegIAlus = configFileFromLocalStorage.mo3177invokegIAlus(params, this);
                    if (objMo3177invokegIAlus == objF) {
                        return objF;
                    }
                    initializeSDK2 = initializeSDK;
                    thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus);
                    if (thM3461exceptionOrNullimpl2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3461exceptionOrNullimpl2.getMessage());
                    }
                    configuration = new Configuration();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus)) {
                        objMo3177invokegIAlus = configuration;
                    }
                    configuration2 = (Configuration) objMo3177invokegIAlus;
                    InitializeStateReset initializeStateReset = initializeSDK2.initializeStateReset;
                    InitializeStateReset.Params params2 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = l0Var;
                    this.L$1 = initializeSDK2;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo3177invokegIAlus2 = initializeStateReset.mo3177invokegIAlus(params2, this);
                    if (objMo3177invokegIAlus2 == objF) {
                        return objF;
                    }
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus2)) {
                        InitializeStateConfig initializeStateConfig = initializeSDK2.initializeStateConfig;
                        InitializeStateConfig.Params params3 = new InitializeStateConfig.Params(configuration2);
                        this.L$0 = l0Var;
                        this.L$1 = initializeSDK2;
                        this.L$2 = configuration2;
                        this.label = 5;
                        objMo3177invokegIAlus3 = initializeStateConfig.mo3177invokegIAlus(params3, this);
                        if (objMo3177invokegIAlus3 == objF) {
                            return objF;
                        }
                        l0Var2 = l0Var;
                        initializeSDK3 = initializeSDK2;
                        obj3 = objMo3177invokegIAlus3;
                        if (Result.m3463isFailureimpl(obj3)) {
                            initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj3);
                            this.L$0 = l0Var2;
                            this.L$1 = initializeSDK3;
                            this.L$2 = obj3;
                            this.L$3 = configuration2;
                            this.label = 6;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateLoadCache initializeStateLoadCache = initializeSDK3.initializeStateLoadCache;
                        kotlin.c.b(obj3);
                        InitializeStateLoadCache.Params params4 = new InitializeStateLoadCache.Params((Configuration) obj3);
                        this.L$0 = l0Var2;
                        this.L$1 = initializeSDK3;
                        this.L$2 = obj3;
                        this.L$3 = configuration2;
                        this.label = 7;
                        objMo3177invokegIAlus4 = initializeStateLoadCache.mo3177invokegIAlus(params4, this);
                        if (objMo3177invokegIAlus4 == objF) {
                            return objF;
                        }
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                            errorState2 = ErrorState.LoadCache;
                            thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                            this.L$0 = objMo3177invokegIAlus4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                                return objF;
                            }
                            obj4 = objMo3177invokegIAlus4;
                            thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                            if (thM3461exceptionOrNullimpl6 == null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw thM3461exceptionOrNullimpl6;
                        }
                        kotlin.c.b(objMo3177invokegIAlus4);
                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled() || loadCacheResult.getWebViewData() == null) {
                                InitializeStateLoadWeb initializeStateLoadWeb = initializeSDK3.initializeStateLoadWeb;
                                kotlin.c.b(obj3);
                                InitializeStateLoadWeb.Params params5 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                                this.L$0 = initializeSDK3;
                                this.L$1 = obj3;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 9;
                                objMo3177invokegIAlus5 = initializeStateLoadWeb.mo3177invokegIAlus(params5, this);
                                if (objMo3177invokegIAlus5 == objF) {
                                    return objF;
                                }
                                obj5 = objMo3177invokegIAlus5;
                                if (Result.m3463isFailureimpl(obj5)) {
                                    initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                    this.L$0 = initializeSDK3;
                                    this.L$1 = obj3;
                                    this.L$2 = obj5;
                                    this.label = 10;
                                    if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                        return objF;
                                    }
                                }
                                kotlin.c.b(obj5);
                                webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            } else {
                                j.d(l0Var2, new k0("LaunchLoadWeb"), null, new InitializeSDK$doWork$2$1$webViewData$1(initializeSDK3, obj3, null), 2, null);
                                webViewData = loadCacheResult.getWebViewData();
                            }
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        InitializeStateCreate initializeStateCreate = initializeSDK3.initializeStateCreate;
                        kotlin.c.b(obj3);
                        InitializeStateCreate.Params params6 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        objMo3177invokegIAlus6 = initializeStateCreate.mo3177invokegIAlus(params6, this);
                        if (objMo3177invokegIAlus6 == objF) {
                            return objF;
                        }
                        obj6 = obj3;
                        initializeSDK4 = initializeSDK3;
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.label = 12;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateComplete initializeStateComplete = initializeSDK4.initializeStateComplete;
                        kotlin.c.b(obj6);
                        InitializeStateComplete.Params params7 = new InitializeStateComplete.Params((Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 13;
                        objMo3177invokegIAlus7 = initializeStateComplete.mo3177invokegIAlus(params7, this);
                        if (objMo3177invokegIAlus7 == objF) {
                            return objF;
                        }
                        kotlin.c.b(objMo3177invokegIAlus7);
                        objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                        } else {
                            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                            if (thM3461exceptionOrNullimpl != null) {
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                            }
                        }
                        return Result.m3457boximpl(objM3458constructorimpl);
                    }
                    errorState = ErrorState.ResetWebApp;
                    thM3461exceptionOrNullimpl3 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus2);
                    this.L$0 = objMo3177invokegIAlus2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (initializeSDK2.m3181executeErrorStateBWLJW6A(errorState, thM3461exceptionOrNullimpl3, configuration2, this) == objF) {
                        return objF;
                    }
                    obj2 = objMo3177invokegIAlus2;
                    thM3461exceptionOrNullimpl4 = Result.m3461exceptionOrNullimpl(obj2);
                    if (thM3461exceptionOrNullimpl4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3461exceptionOrNullimpl4;
                case 1:
                    initializeSDK = (InitializeSDK) this.L$1;
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                    DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                    ConfigFileFromLocalStorage configFileFromLocalStorage2 = initializeSDK.configFileFromLocalStorage;
                    ConfigFileFromLocalStorage.Params params8 = new ConfigFileFromLocalStorage.Params(null, 1, null);
                    this.L$0 = l0Var;
                    this.L$1 = initializeSDK;
                    this.label = 2;
                    objMo3177invokegIAlus = configFileFromLocalStorage2.mo3177invokegIAlus(params8, this);
                    if (objMo3177invokegIAlus == objF) {
                        return objF;
                    }
                    initializeSDK2 = initializeSDK;
                    thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus);
                    if (thM3461exceptionOrNullimpl2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3461exceptionOrNullimpl2.getMessage());
                    }
                    configuration = new Configuration();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus)) {
                        objMo3177invokegIAlus = configuration;
                    }
                    configuration2 = (Configuration) objMo3177invokegIAlus;
                    InitializeStateReset initializeStateReset2 = initializeSDK2.initializeStateReset;
                    InitializeStateReset.Params params9 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = l0Var;
                    this.L$1 = initializeSDK2;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo3177invokegIAlus2 = initializeStateReset2.mo3177invokegIAlus(params9, this);
                    if (objMo3177invokegIAlus2 == objF) {
                        return objF;
                    }
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus2)) {
                        InitializeStateConfig initializeStateConfig2 = initializeSDK2.initializeStateConfig;
                        InitializeStateConfig.Params params10 = new InitializeStateConfig.Params(configuration2);
                        this.L$0 = l0Var;
                        this.L$1 = initializeSDK2;
                        this.L$2 = configuration2;
                        this.label = 5;
                        objMo3177invokegIAlus3 = initializeStateConfig2.mo3177invokegIAlus(params10, this);
                        if (objMo3177invokegIAlus3 == objF) {
                            return objF;
                        }
                        l0Var2 = l0Var;
                        initializeSDK3 = initializeSDK2;
                        obj3 = objMo3177invokegIAlus3;
                        if (Result.m3463isFailureimpl(obj3)) {
                            initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj3);
                            this.L$0 = l0Var2;
                            this.L$1 = initializeSDK3;
                            this.L$2 = obj3;
                            this.L$3 = configuration2;
                            this.label = 6;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateLoadCache initializeStateLoadCache2 = initializeSDK3.initializeStateLoadCache;
                        kotlin.c.b(obj3);
                        InitializeStateLoadCache.Params params11 = new InitializeStateLoadCache.Params((Configuration) obj3);
                        this.L$0 = l0Var2;
                        this.L$1 = initializeSDK3;
                        this.L$2 = obj3;
                        this.L$3 = configuration2;
                        this.label = 7;
                        objMo3177invokegIAlus4 = initializeStateLoadCache2.mo3177invokegIAlus(params11, this);
                        if (objMo3177invokegIAlus4 == objF) {
                            return objF;
                        }
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                            errorState2 = ErrorState.LoadCache;
                            thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                            this.L$0 = objMo3177invokegIAlus4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                                return objF;
                            }
                            obj4 = objMo3177invokegIAlus4;
                            thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                            if (thM3461exceptionOrNullimpl6 == null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw thM3461exceptionOrNullimpl6;
                        }
                        kotlin.c.b(objMo3177invokegIAlus4);
                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            InitializeStateLoadWeb initializeStateLoadWeb2 = initializeSDK3.initializeStateLoadWeb;
                            kotlin.c.b(obj3);
                            InitializeStateLoadWeb.Params params12 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 9;
                            objMo3177invokegIAlus5 = initializeStateLoadWeb2.mo3177invokegIAlus(params12, this);
                            if (objMo3177invokegIAlus5 == objF) {
                                return objF;
                            }
                            obj5 = objMo3177invokegIAlus5;
                            if (Result.m3463isFailureimpl(obj5)) {
                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                this.L$0 = initializeSDK3;
                                this.L$1 = obj3;
                                this.L$2 = obj5;
                                this.label = 10;
                                if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                    return objF;
                                }
                            }
                            kotlin.c.b(obj5);
                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            break;
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        InitializeStateCreate initializeStateCreate2 = initializeSDK3.initializeStateCreate;
                        kotlin.c.b(obj3);
                        InitializeStateCreate.Params params13 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        objMo3177invokegIAlus6 = initializeStateCreate2.mo3177invokegIAlus(params13, this);
                        if (objMo3177invokegIAlus6 == objF) {
                            return objF;
                        }
                        obj6 = obj3;
                        initializeSDK4 = initializeSDK3;
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.label = 12;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateComplete initializeStateComplete2 = initializeSDK4.initializeStateComplete;
                        kotlin.c.b(obj6);
                        InitializeStateComplete.Params params14 = new InitializeStateComplete.Params((Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 13;
                        objMo3177invokegIAlus7 = initializeStateComplete2.mo3177invokegIAlus(params14, this);
                        if (objMo3177invokegIAlus7 == objF) {
                            return objF;
                        }
                        kotlin.c.b(objMo3177invokegIAlus7);
                        objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                        } else {
                            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                            if (thM3461exceptionOrNullimpl != null) {
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                            }
                        }
                        return Result.m3457boximpl(objM3458constructorimpl);
                    }
                    errorState = ErrorState.ResetWebApp;
                    thM3461exceptionOrNullimpl3 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus2);
                    this.L$0 = objMo3177invokegIAlus2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (initializeSDK2.m3181executeErrorStateBWLJW6A(errorState, thM3461exceptionOrNullimpl3, configuration2, this) == objF) {
                        return objF;
                    }
                    obj2 = objMo3177invokegIAlus2;
                    thM3461exceptionOrNullimpl4 = Result.m3461exceptionOrNullimpl(obj2);
                    if (thM3461exceptionOrNullimpl4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3461exceptionOrNullimpl4;
                case 2:
                    initializeSDK = (InitializeSDK) this.L$1;
                    l0 l0Var3 = (l0) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus = ((Result) obj).m3466unboximpl();
                    l0Var = l0Var3;
                    initializeSDK2 = initializeSDK;
                    thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus);
                    if (thM3461exceptionOrNullimpl2 != null) {
                        DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + thM3461exceptionOrNullimpl2.getMessage());
                    }
                    configuration = new Configuration();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus)) {
                        objMo3177invokegIAlus = configuration;
                    }
                    configuration2 = (Configuration) objMo3177invokegIAlus;
                    InitializeStateReset initializeStateReset3 = initializeSDK2.initializeStateReset;
                    InitializeStateReset.Params params15 = new InitializeStateReset.Params(configuration2);
                    this.L$0 = l0Var;
                    this.L$1 = initializeSDK2;
                    this.L$2 = configuration2;
                    this.label = 3;
                    objMo3177invokegIAlus2 = initializeStateReset3.mo3177invokegIAlus(params15, this);
                    if (objMo3177invokegIAlus2 == objF) {
                        return objF;
                    }
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus2)) {
                        InitializeStateConfig initializeStateConfig3 = initializeSDK2.initializeStateConfig;
                        InitializeStateConfig.Params params16 = new InitializeStateConfig.Params(configuration2);
                        this.L$0 = l0Var;
                        this.L$1 = initializeSDK2;
                        this.L$2 = configuration2;
                        this.label = 5;
                        objMo3177invokegIAlus3 = initializeStateConfig3.mo3177invokegIAlus(params16, this);
                        if (objMo3177invokegIAlus3 == objF) {
                            return objF;
                        }
                        l0Var2 = l0Var;
                        initializeSDK3 = initializeSDK2;
                        obj3 = objMo3177invokegIAlus3;
                        if (Result.m3463isFailureimpl(obj3)) {
                            initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj3);
                            this.L$0 = l0Var2;
                            this.L$1 = initializeSDK3;
                            this.L$2 = obj3;
                            this.L$3 = configuration2;
                            this.label = 6;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateLoadCache initializeStateLoadCache3 = initializeSDK3.initializeStateLoadCache;
                        kotlin.c.b(obj3);
                        InitializeStateLoadCache.Params params17 = new InitializeStateLoadCache.Params((Configuration) obj3);
                        this.L$0 = l0Var2;
                        this.L$1 = initializeSDK3;
                        this.L$2 = obj3;
                        this.L$3 = configuration2;
                        this.label = 7;
                        objMo3177invokegIAlus4 = initializeStateLoadCache3.mo3177invokegIAlus(params17, this);
                        if (objMo3177invokegIAlus4 == objF) {
                            return objF;
                        }
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                            errorState2 = ErrorState.LoadCache;
                            thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                            this.L$0 = objMo3177invokegIAlus4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                                return objF;
                            }
                            obj4 = objMo3177invokegIAlus4;
                            thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                            if (thM3461exceptionOrNullimpl6 == null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw thM3461exceptionOrNullimpl6;
                        }
                        kotlin.c.b(objMo3177invokegIAlus4);
                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            InitializeStateLoadWeb initializeStateLoadWeb3 = initializeSDK3.initializeStateLoadWeb;
                            kotlin.c.b(obj3);
                            InitializeStateLoadWeb.Params params18 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 9;
                            objMo3177invokegIAlus5 = initializeStateLoadWeb3.mo3177invokegIAlus(params18, this);
                            if (objMo3177invokegIAlus5 == objF) {
                                return objF;
                            }
                            obj5 = objMo3177invokegIAlus5;
                            if (Result.m3463isFailureimpl(obj5)) {
                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                this.L$0 = initializeSDK3;
                                this.L$1 = obj3;
                                this.L$2 = obj5;
                                this.label = 10;
                                if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                    return objF;
                                }
                            }
                            kotlin.c.b(obj5);
                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            break;
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        InitializeStateCreate initializeStateCreate3 = initializeSDK3.initializeStateCreate;
                        kotlin.c.b(obj3);
                        InitializeStateCreate.Params params19 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        objMo3177invokegIAlus6 = initializeStateCreate3.mo3177invokegIAlus(params19, this);
                        if (objMo3177invokegIAlus6 == objF) {
                            return objF;
                        }
                        obj6 = obj3;
                        initializeSDK4 = initializeSDK3;
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.label = 12;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateComplete initializeStateComplete3 = initializeSDK4.initializeStateComplete;
                        kotlin.c.b(obj6);
                        InitializeStateComplete.Params params110 = new InitializeStateComplete.Params((Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 13;
                        objMo3177invokegIAlus7 = initializeStateComplete3.mo3177invokegIAlus(params110, this);
                        if (objMo3177invokegIAlus7 == objF) {
                            return objF;
                        }
                        kotlin.c.b(objMo3177invokegIAlus7);
                        objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                        } else {
                            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                            if (thM3461exceptionOrNullimpl != null) {
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                            }
                        }
                        return Result.m3457boximpl(objM3458constructorimpl);
                    }
                    errorState = ErrorState.ResetWebApp;
                    thM3461exceptionOrNullimpl3 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus2);
                    this.L$0 = objMo3177invokegIAlus2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (initializeSDK2.m3181executeErrorStateBWLJW6A(errorState, thM3461exceptionOrNullimpl3, configuration2, this) == objF) {
                        return objF;
                    }
                    obj2 = objMo3177invokegIAlus2;
                    thM3461exceptionOrNullimpl4 = Result.m3461exceptionOrNullimpl(obj2);
                    if (thM3461exceptionOrNullimpl4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3461exceptionOrNullimpl4;
                case 3:
                    configuration2 = (Configuration) this.L$2;
                    initializeSDK2 = (InitializeSDK) this.L$1;
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus2 = ((Result) obj).m3466unboximpl();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus2)) {
                        InitializeStateConfig initializeStateConfig4 = initializeSDK2.initializeStateConfig;
                        InitializeStateConfig.Params params111 = new InitializeStateConfig.Params(configuration2);
                        this.L$0 = l0Var;
                        this.L$1 = initializeSDK2;
                        this.L$2 = configuration2;
                        this.label = 5;
                        objMo3177invokegIAlus3 = initializeStateConfig4.mo3177invokegIAlus(params111, this);
                        if (objMo3177invokegIAlus3 == objF) {
                            return objF;
                        }
                        l0Var2 = l0Var;
                        initializeSDK3 = initializeSDK2;
                        obj3 = objMo3177invokegIAlus3;
                        if (Result.m3463isFailureimpl(obj3)) {
                            initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj3);
                            this.L$0 = l0Var2;
                            this.L$1 = initializeSDK3;
                            this.L$2 = obj3;
                            this.L$3 = configuration2;
                            this.label = 6;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateLoadCache initializeStateLoadCache4 = initializeSDK3.initializeStateLoadCache;
                        kotlin.c.b(obj3);
                        InitializeStateLoadCache.Params params112 = new InitializeStateLoadCache.Params((Configuration) obj3);
                        this.L$0 = l0Var2;
                        this.L$1 = initializeSDK3;
                        this.L$2 = obj3;
                        this.L$3 = configuration2;
                        this.label = 7;
                        objMo3177invokegIAlus4 = initializeStateLoadCache4.mo3177invokegIAlus(params112, this);
                        if (objMo3177invokegIAlus4 == objF) {
                            return objF;
                        }
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                            errorState2 = ErrorState.LoadCache;
                            thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                            this.L$0 = objMo3177invokegIAlus4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                                return objF;
                            }
                            obj4 = objMo3177invokegIAlus4;
                            thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                            if (thM3461exceptionOrNullimpl6 == null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw thM3461exceptionOrNullimpl6;
                        }
                        kotlin.c.b(objMo3177invokegIAlus4);
                        loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                            }
                            InitializeStateLoadWeb initializeStateLoadWeb4 = initializeSDK3.initializeStateLoadWeb;
                            kotlin.c.b(obj3);
                            InitializeStateLoadWeb.Params params113 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 9;
                            objMo3177invokegIAlus5 = initializeStateLoadWeb4.mo3177invokegIAlus(params113, this);
                            if (objMo3177invokegIAlus5 == objF) {
                                return objF;
                            }
                            obj5 = objMo3177invokegIAlus5;
                            if (Result.m3463isFailureimpl(obj5)) {
                                initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                                this.L$0 = initializeSDK3;
                                this.L$1 = obj3;
                                this.L$2 = obj5;
                                this.label = 10;
                                if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                    return objF;
                                }
                            }
                            kotlin.c.b(obj5);
                            webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                            break;
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        InitializeStateCreate initializeStateCreate4 = initializeSDK3.initializeStateCreate;
                        kotlin.c.b(obj3);
                        InitializeStateCreate.Params params114 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        objMo3177invokegIAlus6 = initializeStateCreate4.mo3177invokegIAlus(params114, this);
                        if (objMo3177invokegIAlus6 == objF) {
                            return objF;
                        }
                        obj6 = obj3;
                        initializeSDK4 = initializeSDK3;
                        if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                            initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                            this.L$0 = initializeSDK4;
                            this.L$1 = obj6;
                            this.label = 12;
                            if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                                return objF;
                            }
                        }
                        InitializeStateComplete initializeStateComplete4 = initializeSDK4.initializeStateComplete;
                        kotlin.c.b(obj6);
                        InitializeStateComplete.Params params115 = new InitializeStateComplete.Params((Configuration) obj6);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 13;
                        objMo3177invokegIAlus7 = initializeStateComplete4.mo3177invokegIAlus(params115, this);
                        if (objMo3177invokegIAlus7 == objF) {
                            return objF;
                        }
                        kotlin.c.b(objMo3177invokegIAlus7);
                        objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                        } else {
                            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                            if (thM3461exceptionOrNullimpl != null) {
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                            }
                        }
                        return Result.m3457boximpl(objM3458constructorimpl);
                    }
                    errorState = ErrorState.ResetWebApp;
                    thM3461exceptionOrNullimpl3 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus2);
                    this.L$0 = objMo3177invokegIAlus2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (initializeSDK2.m3181executeErrorStateBWLJW6A(errorState, thM3461exceptionOrNullimpl3, configuration2, this) == objF) {
                        return objF;
                    }
                    obj2 = objMo3177invokegIAlus2;
                    thM3461exceptionOrNullimpl4 = Result.m3461exceptionOrNullimpl(obj2);
                    if (thM3461exceptionOrNullimpl4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3461exceptionOrNullimpl4;
                case 4:
                    obj2 = this.L$0;
                    kotlin.c.b(obj);
                    ((Result) obj).m3466unboximpl();
                    thM3461exceptionOrNullimpl4 = Result.m3461exceptionOrNullimpl(obj2);
                    if (thM3461exceptionOrNullimpl4 == null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw thM3461exceptionOrNullimpl4;
                case 5:
                    configuration2 = (Configuration) this.L$2;
                    initializeSDK2 = (InitializeSDK) this.L$1;
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus3 = ((Result) obj).m3466unboximpl();
                    l0Var2 = l0Var;
                    initializeSDK3 = initializeSDK2;
                    obj3 = objMo3177invokegIAlus3;
                    if (Result.m3463isFailureimpl(obj3)) {
                        initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj3);
                        this.L$0 = l0Var2;
                        this.L$1 = initializeSDK3;
                        this.L$2 = obj3;
                        this.L$3 = configuration2;
                        this.label = 6;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateLoadCache initializeStateLoadCache5 = initializeSDK3.initializeStateLoadCache;
                    kotlin.c.b(obj3);
                    InitializeStateLoadCache.Params params116 = new InitializeStateLoadCache.Params((Configuration) obj3);
                    this.L$0 = l0Var2;
                    this.L$1 = initializeSDK3;
                    this.L$2 = obj3;
                    this.L$3 = configuration2;
                    this.label = 7;
                    objMo3177invokegIAlus4 = initializeStateLoadCache5.mo3177invokegIAlus(params116, this);
                    if (objMo3177invokegIAlus4 == objF) {
                        return objF;
                    }
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                        errorState2 = ErrorState.LoadCache;
                        thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                        this.L$0 = objMo3177invokegIAlus4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                            return objF;
                        }
                        obj4 = objMo3177invokegIAlus4;
                        thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                        if (thM3461exceptionOrNullimpl6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thM3461exceptionOrNullimpl6;
                    }
                    kotlin.c.b(objMo3177invokegIAlus4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb5 = initializeSDK3.initializeStateLoadWeb;
                        kotlin.c.b(obj3);
                        InitializeStateLoadWeb.Params params117 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo3177invokegIAlus5 = initializeStateLoadWeb5.mo3177invokegIAlus(params117, this);
                        if (objMo3177invokegIAlus5 == objF) {
                            return objF;
                        }
                        obj5 = objMo3177invokegIAlus5;
                        if (Result.m3463isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = obj5;
                            this.label = 10;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                return objF;
                            }
                        }
                        kotlin.c.b(obj5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate5 = initializeSDK3.initializeStateCreate;
                    kotlin.c.b(obj3);
                    InitializeStateCreate.Params params118 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                    this.L$0 = initializeSDK3;
                    this.L$1 = obj3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo3177invokegIAlus6 = initializeStateCreate5.mo3177invokegIAlus(params118, this);
                    if (objMo3177invokegIAlus6 == objF) {
                        return objF;
                    }
                    obj6 = obj3;
                    initializeSDK4 = initializeSDK3;
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete5 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params119 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete5.mo3177invokegIAlus(params119, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 6:
                    configuration2 = (Configuration) this.L$3;
                    obj3 = this.L$2;
                    initializeSDK3 = (InitializeSDK) this.L$1;
                    l0Var2 = (l0) this.L$0;
                    kotlin.c.b(obj);
                    InitializeStateLoadCache initializeStateLoadCache6 = initializeSDK3.initializeStateLoadCache;
                    kotlin.c.b(obj3);
                    InitializeStateLoadCache.Params params1110 = new InitializeStateLoadCache.Params((Configuration) obj3);
                    this.L$0 = l0Var2;
                    this.L$1 = initializeSDK3;
                    this.L$2 = obj3;
                    this.L$3 = configuration2;
                    this.label = 7;
                    objMo3177invokegIAlus4 = initializeStateLoadCache6.mo3177invokegIAlus(params1110, this);
                    if (objMo3177invokegIAlus4 == objF) {
                        return objF;
                    }
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                        errorState2 = ErrorState.LoadCache;
                        thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                        this.L$0 = objMo3177invokegIAlus4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                            return objF;
                        }
                        obj4 = objMo3177invokegIAlus4;
                        thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                        if (thM3461exceptionOrNullimpl6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thM3461exceptionOrNullimpl6;
                    }
                    kotlin.c.b(objMo3177invokegIAlus4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb6 = initializeSDK3.initializeStateLoadWeb;
                        kotlin.c.b(obj3);
                        InitializeStateLoadWeb.Params params1111 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo3177invokegIAlus5 = initializeStateLoadWeb6.mo3177invokegIAlus(params1111, this);
                        if (objMo3177invokegIAlus5 == objF) {
                            return objF;
                        }
                        obj5 = objMo3177invokegIAlus5;
                        if (Result.m3463isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = obj5;
                            this.label = 10;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                return objF;
                            }
                        }
                        kotlin.c.b(obj5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate6 = initializeSDK3.initializeStateCreate;
                    kotlin.c.b(obj3);
                    InitializeStateCreate.Params params1112 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                    this.L$0 = initializeSDK3;
                    this.L$1 = obj3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo3177invokegIAlus6 = initializeStateCreate6.mo3177invokegIAlus(params1112, this);
                    if (objMo3177invokegIAlus6 == objF) {
                        return objF;
                    }
                    obj6 = obj3;
                    initializeSDK4 = initializeSDK3;
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete6 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params1113 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete6.mo3177invokegIAlus(params1113, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 7:
                    configuration2 = (Configuration) this.L$3;
                    obj3 = this.L$2;
                    initializeSDK3 = (InitializeSDK) this.L$1;
                    l0Var2 = (l0) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus4 = ((Result) obj).m3466unboximpl();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus4)) {
                        errorState2 = ErrorState.LoadCache;
                        thM3461exceptionOrNullimpl5 = Result.m3461exceptionOrNullimpl(objMo3177invokegIAlus4);
                        this.L$0 = objMo3177invokegIAlus4;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        if (initializeSDK3.m3181executeErrorStateBWLJW6A(errorState2, thM3461exceptionOrNullimpl5, configuration2, this) == objF) {
                            return objF;
                        }
                        obj4 = objMo3177invokegIAlus4;
                        thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                        if (thM3461exceptionOrNullimpl6 == null) {
                            throw new Exception(ErrorState.LoadCache.toString());
                        }
                        throw thM3461exceptionOrNullimpl6;
                    }
                    kotlin.c.b(objMo3177invokegIAlus4);
                    loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) objMo3177invokegIAlus4;
                    if (loadCacheResult.getHasHashMismatch()) {
                        if (configuration2.getExperiments().isWebViewAsyncDownloadEnabled()) {
                        }
                        InitializeStateLoadWeb initializeStateLoadWeb7 = initializeSDK3.initializeStateLoadWeb;
                        kotlin.c.b(obj3);
                        InitializeStateLoadWeb.Params params1114 = new InitializeStateLoadWeb.Params((Configuration) obj3);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        objMo3177invokegIAlus5 = initializeStateLoadWeb7.mo3177invokegIAlus(params1114, this);
                        if (objMo3177invokegIAlus5 == objF) {
                            return objF;
                        }
                        obj5 = objMo3177invokegIAlus5;
                        if (Result.m3463isFailureimpl(obj5)) {
                            initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = initializeSDK3;
                            this.L$1 = obj3;
                            this.L$2 = obj5;
                            this.label = 10;
                            if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                                return objF;
                            }
                        }
                        kotlin.c.b(obj5);
                        webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                        break;
                    } else {
                        webViewData = loadCacheResult.getWebViewData();
                        if (webViewData == null) {
                            throw new IllegalStateException("WebView is missing.".toString());
                        }
                    }
                    InitializeStateCreate initializeStateCreate7 = initializeSDK3.initializeStateCreate;
                    kotlin.c.b(obj3);
                    InitializeStateCreate.Params params1115 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                    this.L$0 = initializeSDK3;
                    this.L$1 = obj3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo3177invokegIAlus6 = initializeStateCreate7.mo3177invokegIAlus(params1115, this);
                    if (objMo3177invokegIAlus6 == objF) {
                        return objF;
                    }
                    obj6 = obj3;
                    initializeSDK4 = initializeSDK3;
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete7 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params1116 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete7.mo3177invokegIAlus(params1116, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 8:
                    obj4 = this.L$0;
                    kotlin.c.b(obj);
                    ((Result) obj).m3466unboximpl();
                    thM3461exceptionOrNullimpl6 = Result.m3461exceptionOrNullimpl(obj4);
                    if (thM3461exceptionOrNullimpl6 == null) {
                        throw new Exception(ErrorState.LoadCache.toString());
                    }
                    throw thM3461exceptionOrNullimpl6;
                case 9:
                    Object obj7 = this.L$1;
                    InitializeSDK initializeSDK5 = (InitializeSDK) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus5 = ((Result) obj).m3466unboximpl();
                    initializeSDK3 = initializeSDK5;
                    obj3 = obj7;
                    obj5 = objMo3177invokegIAlus5;
                    if (Result.m3463isFailureimpl(obj5)) {
                        initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                        this.L$0 = initializeSDK3;
                        this.L$1 = obj3;
                        this.L$2 = obj5;
                        this.label = 10;
                        if (initializeSDK3.handleInitializationException(initializationExceptionOrThrow2, this) == objF) {
                            return objF;
                        }
                    }
                    kotlin.c.b(obj5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate8 = initializeSDK3.initializeStateCreate;
                    kotlin.c.b(obj3);
                    InitializeStateCreate.Params params1117 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                    this.L$0 = initializeSDK3;
                    this.L$1 = obj3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo3177invokegIAlus6 = initializeStateCreate8.mo3177invokegIAlus(params1117, this);
                    if (objMo3177invokegIAlus6 == objF) {
                        return objF;
                    }
                    obj6 = obj3;
                    initializeSDK4 = initializeSDK3;
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete8 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params1118 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete8.mo3177invokegIAlus(params1118, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 10:
                    obj5 = this.L$2;
                    obj3 = this.L$1;
                    initializeSDK3 = (InitializeSDK) this.L$0;
                    kotlin.c.b(obj);
                    kotlin.c.b(obj5);
                    webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj5).getWebViewDataString();
                    InitializeStateCreate initializeStateCreate9 = initializeSDK3.initializeStateCreate;
                    kotlin.c.b(obj3);
                    InitializeStateCreate.Params params1119 = new InitializeStateCreate.Params((Configuration) obj3, webViewData);
                    this.L$0 = initializeSDK3;
                    this.L$1 = obj3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 11;
                    objMo3177invokegIAlus6 = initializeStateCreate9.mo3177invokegIAlus(params1119, this);
                    if (objMo3177invokegIAlus6 == objF) {
                        return objF;
                    }
                    obj6 = obj3;
                    initializeSDK4 = initializeSDK3;
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete9 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params11110 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete9.mo3177invokegIAlus(params11110, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 11:
                    obj6 = this.L$1;
                    initializeSDK4 = (InitializeSDK) this.L$0;
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus6 = ((Result) obj).m3466unboximpl();
                    if (Result.m3463isFailureimpl(objMo3177invokegIAlus6)) {
                        initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(objMo3177invokegIAlus6);
                        this.L$0 = initializeSDK4;
                        this.L$1 = obj6;
                        this.label = 12;
                        if (initializeSDK4.handleInitializationException(initializationExceptionOrThrow3, this) == objF) {
                            return objF;
                        }
                    }
                    InitializeStateComplete initializeStateComplete10 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params11111 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete10.mo3177invokegIAlus(params11111, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 12:
                    obj6 = this.L$1;
                    initializeSDK4 = (InitializeSDK) this.L$0;
                    kotlin.c.b(obj);
                    InitializeStateComplete initializeStateComplete11 = initializeSDK4.initializeStateComplete;
                    kotlin.c.b(obj6);
                    InitializeStateComplete.Params params11112 = new InitializeStateComplete.Params((Configuration) obj6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 13;
                    objMo3177invokegIAlus7 = initializeStateComplete11.mo3177invokegIAlus(params11112, this);
                    if (objMo3177invokegIAlus7 == objF) {
                        return objF;
                    }
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                case 13:
                    kotlin.c.b(obj);
                    objMo3177invokegIAlus7 = ((Result) obj).m3466unboximpl();
                    kotlin.c.b(objMo3177invokegIAlus7);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                    } else {
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                        }
                    }
                    return Result.m3457boximpl(objM3458constructorimpl);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }
}
