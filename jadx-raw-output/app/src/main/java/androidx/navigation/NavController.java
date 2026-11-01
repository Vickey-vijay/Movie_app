package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import mj.g;
import mj.h;
import mj.r;
import nj.b0;
import nj.i;
import nj.n;
import nj.s;
import nj.x;
import qk.e;
import qk.k;
import qk.l;
import qk.q;
import qk.u;
import qk.v;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000 Þ\u00012\u00020\u0001:\u0006Þ\u0001ß\u0001à\u0001B\u0011\u0012\u0006\u0010o\u001a\u00020n¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002JL\u0010\u0011\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J:\u0010\u0015\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J$\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003J*\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0003J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\u0012\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003J\u0012\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020$H\u0002J\u0018\u0010(\u001a\u0004\u0018\u00010\b*\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0002J.\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J.\u0010-\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J2\u00103\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020\u00022\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0019\u00107\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b5\u00106J\u0010\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016J\b\u0010<\u001a\u00020\u0013H\u0017J\u001a\u0010<\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0017J\"\u0010<\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\"\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007J%\u0010B\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050>H\u0000¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020\u00132\u0006\u0010=\u001a\u00020&H\u0007J\u0012\u0010C\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010D\u001a\u00020\u0013H\u0017J\u000f\u0010G\u001a\u00020\u0005H\u0000¢\u0006\u0004\bE\u0010FJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\bH\u0010IJ\u0012\u0010L\u001a\u00020\u00052\b\b\u0001\u0010K\u001a\u00020\u0016H\u0017J\u001c\u0010L\u001a\u00020\u00052\b\b\u0001\u0010K\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017J\u001a\u0010L\u001a\u00020\u00052\u0006\u0010N\u001a\u00020M2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017J\u0012\u0010Q\u001a\u00020\u00132\b\u0010P\u001a\u0004\u0018\u00010OH\u0017J\u0014\u0010(\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010\b2\u0006\u0010R\u001a\u00020&H\u0007J\u0012\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u0016H\u0017J\u001c\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!H\u0017J&\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J0\u0010+\u001a\u00020\u00052\b\b\u0001\u0010S\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020TH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020T2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020T2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020UH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u0010+\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020WH\u0017J\u001a\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010X\u001a\u00020W2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\"\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020&2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00050\u000fJ(\u0010+\u001a\u00020\u00052\u0006\u0010=\u001a\u00020&2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\\\u001a\u00020[H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010!H\u0017J\u0012\u0010^\u001a\u00020\u00052\b\u0010]\u001a\u0004\u0018\u00010!H\u0017J\u0010\u0010a\u001a\u00020\u00052\u0006\u0010`\u001a\u00020_H\u0017J\u0010\u0010d\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bH\u0017J\u0010\u0010f\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u0013H\u0017J\u0010\u0010i\u001a\u00020\u00052\u0006\u0010h\u001a\u00020gH\u0017J\u0012\u0010l\u001a\u00020k2\b\b\u0001\u0010j\u001a\u00020\u0016H\u0016J\u0012\u0010m\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010m\u001a\u00020\u00022\u0006\u0010=\u001a\u00020&R\u0017\u0010o\u001a\u00020n8\u0007¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010{\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u001f\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R%\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198WX\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R$\u0010\u0088\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u008b\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008a\u00018\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R%\u0010\u0093\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0092\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R&\u0010\u0094\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R*\u0010\u0095\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u0002080\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00030 \u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0082\u0001R\u001a\u0010¯\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R1\u0010²\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070±\u0001R\u00020\u00000\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010\u0091\u0001R'\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R'\u0010µ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010´\u0001R$\u0010¶\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010\u0091\u0001R\u0019\u0010·\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R \u0010À\u0001\u001a\u00020v8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R#\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ä\u00018\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R'\u0010N\u001a\u00020M2\u0006\u0010N\u001a\u00020M8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0005\bL\u0010Î\u0001R,\u0010Ï\u0001\u001a\u00030®\u00012\b\u0010Ï\u0001\u001a\u00030®\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ö\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Ø\u0001¨\u0006á\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "Lmj/r;", "linkChildToParent", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "handler", "navigateInternal", "popUpTo", "", "saveState", "popBackStackInternal", "", "destinationId", "inclusive", "Lnj/i;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack", "clearBackStackInternal", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "dispatchOnDestinationChanged", "Landroid/os/Bundle;", "startDestinationArgs", "onGraphCreated", "", "deepLink", "", "findInvalidDestinationDisplayNameInDeepLink", "findDestination", "node", "args", "navigate", "id", "restoreStateInternal", "backStackState", "instantiateBackStack", "finalArgs", "backStackEntry", "restoredEntries", "addEntryToBackStack", "updateOnBackPressedCallbackEnabled", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnDestinationChangedListener", "removeOnDestinationChangedListener", "popBackStack", "route", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lbk/a;)V", "popBackStackFromNavigator", "clearBackStack", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "Landroidx/navigation/NavGraph;", "graph", "Landroid/content/Intent;", "intent", "handleDeepLink", "destinationRoute", "resId", "Landroid/net/Uri;", "Landroidx/navigation/NavDeepLinkRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/navigation/NavDirections;", "directions", "Landroidx/navigation/NavOptionsBuilder;", "builder", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "navState", "restoreState", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "enabled", "enableOnBackPressed", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "getBackStackEntry", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "_graph", "Landroidx/navigation/NavGraph;", "navigatorStateToRestore", "Landroid/os/Bundle;", "", "Landroid/os/Parcelable;", "backStackToRestore", "[Landroid/os/Parcelable;", "deepLinkHandled", "Z", "backQueue", "Lnj/i;", "getBackQueue", "()Lnj/i;", "Lqk/l;", "_visibleEntries", "Lqk/l;", "Lqk/u;", "visibleEntries", "Lqk/u;", "getVisibleEntries", "()Lqk/u;", "", "childToParentEntries", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicInteger;", "parentToChildCount", "backStackMap", "backStackStates", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "addToBackStackHandler", "Lbk/l;", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "I", "", "backStackEntriesToDispatch", "Ljava/util/List;", "navInflater$delegate", "Lmj/g;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Lqk/k;", "_currentBackStackEntryFlow", "Lqk/k;", "Lqk/c;", "currentBackStackEntryFlow", "Lqk/c;", "getCurrentBackStackEntryFlow", "()Lqk/c;", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public class NavController {
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final String TAG = "NavController";
    private final k<NavBackStackEntry> _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final l<List<NavBackStackEntry>> _visibleEntries;
    private Activity activity;
    private bk.l<? super NavBackStackEntry, r> addToBackStackHandler;
    private final i<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, i<NavBackStackEntryState>> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;
    private final qk.c<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: navInflater$delegate, reason: from kotlin metadata */
    private final g navInflater;
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    private bk.l<? super NavBackStackEntry, r> popFromBackStackHandler;
    private NavControllerViewModel viewModel;
    private final u<List<NavBackStackEntry>> visibleEntries;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u001f\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lmj/r;", "push", "addInternal", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "popUpTo", "", "saveState", "pop", "popWithTransition", "entry", "markTransitionComplete", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        public final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            p.j(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(NavBackStackEntry navBackStackEntry) {
            p.j(navBackStackEntry, "backStackEntry");
            super.push(navBackStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle arguments) {
            p.j(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.this$0.getContext(), destination, arguments, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry navBackStackEntry) {
            NavControllerViewModel navControllerViewModel;
            p.j(navBackStackEntry, "entry");
            boolean zE = p.e(this.this$0.entrySavedState.get(navBackStackEntry), Boolean.TRUE);
            super.markTransitionComplete(navBackStackEntry);
            this.this$0.entrySavedState.remove(navBackStackEntry);
            if (this.this$0.getBackQueue().contains(navBackStackEntry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.h(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            this.this$0.unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            if (navBackStackEntry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            i<NavBackStackEntry> backQueue = this.this$0.getBackQueue();
            boolean z10 = true;
            if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
                Iterator<NavBackStackEntry> it = backQueue.iterator();
                while (it.hasNext()) {
                    if (p.e(it.next().getId(), navBackStackEntry.getId())) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && !zE && (navControllerViewModel = this.this$0.viewModel) != null) {
                navControllerViewModel.clear(navBackStackEntry.getId());
            }
            this.this$0.updateBackStackLifecycle$navigation_runtime_release();
            this.this$0._visibleEntries.h(this.this$0.populateVisibleEntries$navigation_runtime_release());
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(final NavBackStackEntry navBackStackEntry, final boolean z10) {
            p.j(navBackStackEntry, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (!p.e(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                p.g(obj);
                ((NavControllerNavigatorState) obj).pop(navBackStackEntry, z10);
            } else {
                bk.l lVar = this.this$0.popFromBackStackHandler;
                if (lVar == null) {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(navBackStackEntry, new bk.a<r>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
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
                            super/*androidx.navigation.NavigatorState*/.pop(navBackStackEntry, z10);
                        }
                    });
                } else {
                    lVar.invoke(navBackStackEntry);
                    super.pop(navBackStackEntry, z10);
                }
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z10) {
            p.j(navBackStackEntry, "popUpTo");
            super.popWithTransition(navBackStackEntry, z10);
            this.this$0.entrySavedState.put(navBackStackEntry, Boolean.valueOf(z10));
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry navBackStackEntry) {
            p.j(navBackStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName());
            if (!p.e(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).push(navBackStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            bk.l lVar = this.this$0.addToBackStackHandler;
            if (lVar != null) {
                lVar.invoke(navBackStackEntry);
                addInternal(navBackStackEntry);
                return;
            }
            Log.i(NavController.TAG, "Ignoring add of destination " + navBackStackEntry.getDestination() + " outside of the call to navigate(). ");
        }
    }

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Lmj/r;", "onDestinationChanged", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z10) {
        INSTANCE.enableDeepLinkSaveState(z10);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z10, bk.l<? super NavBackStackEntry, r> lVar) {
        this.popFromBackStackHandler = lVar;
        navigator.popBackStack(navBackStackEntry, z10);
        this.popFromBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z10, bk.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i10 & 4) != 0) {
            lVar = new bk.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.popBackStackInternal.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry2) {
                    p.j(navBackStackEntry2, "it");
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry2) {
                    invoke2(navBackStackEntry2);
                    return r.f64562a;
                }
            };
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z10, lVar);
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        p.j(route, "route");
        return clearBackStack(NavDestination.INSTANCE.createRoute(route).hashCode());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int destinationId) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        p.g(navGraph);
        if (navGraph.getId() == destinationId) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (destination = navBackStackEntryM.getDestination()) == null) {
            destination = this._graph;
            p.g(destination);
        }
        return findDestination(destination, destinationId);
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int destinationId) {
        NavBackStackEntry navBackStackEntryPrevious;
        i<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!(navBackStackEntryPrevious.getDestination().getId() == destinationId));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @MainThread
    public void navigate(@IdRes int i10) {
        navigate(i10, (Bundle) null);
    }

    public final void navigate(String str) {
        p.j(str, "route");
        navigate$default(this, str, null, null, 6, null);
    }

    public final void navigate(String str, NavOptions navOptions) {
        p.j(str, "route");
        navigate$default(this, str, navOptions, null, 4, null);
    }

    @MainThread
    public boolean popBackStack() {
        if (getBackQueue().isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        p.g(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @MainThread
    public final boolean popBackStack(String str, boolean z10) {
        p.j(str, "route");
        return popBackStack$default(this, str, z10, false, 4, null);
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph navGraph) {
        p.j(navGraph, "graph");
        setGraph(navGraph, (Bundle) null);
    }

    /* JADX INFO: compiled from: NavController.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "", "saveState", "Lmj/r;", "enableDeepLinkSaveState", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "Z", "<init>", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z10) {
            NavController.deepLinkSaveState = z10;
        }
    }

    public NavController(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        for (Object obj : kk.r.p(context, new bk.l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // bk.l
            public final Context invoke(Context context2) {
                p.j(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.activity = (Activity) obj;
                this.backQueue = new i<>();
                l<List<NavBackStackEntry>> lVarA = v.a(s.k());
                this._visibleEntries = lVarA;
                this.visibleEntries = e.b(lVarA);
                this.childToParentEntries = new LinkedHashMap();
                this.parentToChildCount = new LinkedHashMap();
                this.backStackMap = new LinkedHashMap();
                this.backStackStates = new LinkedHashMap();
                this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
                this.hostLifecycleState = Lifecycle.State.INITIALIZED;
                this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        NavController.m19lifecycleObserver$lambda2(this.f4631b, lifecycleOwner, event);
                    }
                };
                this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
                    {
                        super(false);
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        this.this$0.popBackStack();
                    }
                };
                this.enableOnBackPressedCallback = true;
                this._navigatorProvider = new NavigatorProvider();
                this.navigatorState = new LinkedHashMap();
                this.entrySavedState = new LinkedHashMap();
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
                this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
                this.backStackEntriesToDispatch = new ArrayList();
                this.navInflater = kotlin.b.a(new bk.a<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // bk.a
                    public final NavInflater invoke() {
                        NavInflater navInflater = this.this$0.inflater;
                        return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
                    }
                });
                k<NavBackStackEntry> kVarB = q.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                this._currentBackStackEntryFlow = kVarB;
                this.currentBackStackEntryFlow = e.a(kVarB);
            }
        }
        obj = null;
        this.activity = (Activity) obj;
        this.backQueue = new i<>();
        l<List<NavBackStackEntry>> lVarA2 = v.a(s.k());
        this._visibleEntries = lVarA2;
        this.visibleEntries = e.b(lVarA2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.m19lifecycleObserver$lambda2(this.f4631b, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider2 = this._navigatorProvider;
        navigatorProvider2.addNavigator(new NavGraphNavigator(navigatorProvider2));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = kotlin.b.a(new bk.a<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final NavInflater invoke() {
                NavInflater navInflater = this.this$0.inflater;
                return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
            }
        });
        k<NavBackStackEntry> kVarB2 = q.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = kVarB2;
        this.currentBackStackEntryFlow = e.a(kVarB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntry2;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        Bundle bundle2 = bundle;
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        List<NavBackStackEntry> list2 = list;
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof FloatingWindow)) {
            while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof FloatingWindow) && popBackStackInternal$default(this, getBackQueue().last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        i<NavBackStackEntry> iVar = new i();
        NavBackStackEntry navBackStackEntry4 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination2 = destination;
            while (true) {
                p.g(navDestination2);
                NavGraph parent = navDestination2.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list2.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                        navBackStackEntryPrevious2 = listIterator.previous();
                    } while (!p.e(navBackStackEntryPrevious2.getDestination(), parent));
                    NavBackStackEntry navBackStackEntryCreate$default = navBackStackEntryPrevious2;
                    if (navBackStackEntryCreate$default == null) {
                        navBackStackEntry2 = navBackStackEntry3;
                        navBackStackEntryCreate$default = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.context, parent, bundle, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        navBackStackEntry2 = navBackStackEntry3;
                    }
                    iVar.addFirst(navBackStackEntryCreate$default);
                    if ((!getBackQueue().isEmpty()) && getBackQueue().last().getDestination() == parent) {
                        popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
                    }
                } else {
                    destination = destination;
                    navBackStackEntry2 = navBackStackEntry3;
                }
                if (parent == 0 || parent == navDestination) {
                    break;
                }
                navBackStackEntry3 = navBackStackEntry2;
                navDestination2 = parent;
                iVar = iVar;
                bundle2 = bundle2;
                list2 = list2;
                destination = destination;
            }
        } else {
            iVar = iVar;
            destination = destination;
            list2 = list2;
            navBackStackEntry2 = navBackStackEntry3;
            bundle2 = bundle2;
        }
        NavDestination destination2 = iVar.isEmpty() ? destination : ((NavBackStackEntry) iVar.first()).getDestination();
        while (destination2 != null && findDestination(destination2.getId()) == null) {
            destination2 = destination2.getParent();
            if (destination2 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator2.previous();
                } while (!p.e(navBackStackEntryPrevious.getDestination(), destination2));
                NavBackStackEntry navBackStackEntryCreate$default2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate$default2 == null) {
                    navBackStackEntryCreate$default2 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.context, destination2, destination2.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                }
                iVar.addFirst(navBackStackEntryCreate$default2);
            }
        }
        if (!iVar.isEmpty()) {
            destination = ((NavBackStackEntry) iVar.first()).getDestination();
        }
        while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof NavGraph) && ((NavGraph) getBackQueue().last().getDestination()).findNode(destination.getId(), false) == null) {
            popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryJ = getBackQueue().j();
        if (navBackStackEntryJ == null) {
            navBackStackEntryJ = (NavBackStackEntry) iVar.j();
        }
        if (!p.e(navBackStackEntryJ != null ? navBackStackEntryJ.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination3 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph = this._graph;
                p.g(navGraph);
                if (p.e(destination3, navGraph)) {
                    navBackStackEntry4 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate$default3 = navBackStackEntry4;
            if (navBackStackEntryCreate$default3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                Context context = this.context;
                NavGraph navGraph2 = this._graph;
                p.g(navGraph2);
                NavGraph navGraph3 = this._graph;
                p.g(navGraph3);
                navBackStackEntryCreate$default3 = NavBackStackEntry.Companion.create$default(companion, context, navGraph2, navGraph3.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            iVar.addFirst(navBackStackEntryCreate$default3);
        }
        for (NavBackStackEntry navBackStackEntry5 : iVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry5.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry5);
        }
        getBackQueue().addAll(iVar);
        getBackQueue().add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry6 : b0.z0(iVar, navBackStackEntry2)) {
            NavGraph parent2 = navBackStackEntry6.getDestination().getParent();
            if (parent2 != null) {
                linkChildToParent(navBackStackEntry6, getBackStackEntry(parent2.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = s.k();
        }
        navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(destinationId, null, null, null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal(destinationId, true, false);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            NavDestination navDestinationFindNode = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                NavGraph navGraph3 = this._graph;
                p.g(navGraph3);
                if (navGraph3.getId() == i11) {
                    navDestinationFindNode = this._graph;
                }
            } else {
                p.g(navGraph2);
                navDestinationFindNode = navGraph2.findNode(i11);
            }
            if (navDestinationFindNode == null) {
                return NavDestination.INSTANCE.getDisplayName(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (navDestinationFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationFindNode;
                    p.g(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationFindNode = navGraph.findNode(navGraph.getStartDestId());
                }
                navGraph2 = navGraph;
            }
            i10++;
        }
    }

    private final List<NavBackStackEntry> instantiateBackStack(i<NavBackStackEntryState> backStackState) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (graph = navBackStackEntryM.getDestination()) == null) {
            graph = getGraph();
        }
        if (backStackState != null) {
            for (NavBackStackEntryState navBackStackEntryState : backStackState) {
                NavDestination navDestinationFindDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + graph).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                graph = navDestinationFindDestination;
            }
        }
        return arrayList;
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        p.g(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            navOptions = null;
        }
        if ((i10 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, bk.l<? super NavBackStackEntry, r> lVar) {
        this.addToBackStackHandler = lVar;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, bk.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i10 & 8) != 0) {
            lVar = new bk.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.navigateInternal.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry) {
                    p.j(navBackStackEntry, "it");
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return r.f64562a;
                }
            };
        }
        navController.navigateInternal(navigator, list, navOptions, extras, lVar);
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            for (String str : stringArrayList) {
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                p.i(str, "name");
                Navigator navigator = navigatorProvider.getNavigator(str);
                Bundle bundle3 = bundle2.getBundle(str);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        boolean z10 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationFindDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (navDestinationFindDestination == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(this.context, navDestinationFindDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                    map.put(navigator2, navControllerNavigatorState);
                }
                getBackQueue().add(navBackStackEntryInstantiate);
                navControllerNavigatorState.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(navBackStackEntryInstantiate, getBackStackEntry(parent.getId()));
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph == null || !getBackQueue().isEmpty()) {
            dispatchOnDestinationChanged();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            p.g(activity);
            if (handleDeepLink(activity.getIntent())) {
                z10 = true;
            }
        }
        if (z10) {
            return;
        }
        NavGraph navGraph = this._graph;
        p.g(navGraph);
        navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStack(str, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z10, i iVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            iVar = new i();
        }
        navController.popEntryFromBackStack(navBackStackEntry, z10, iVar);
    }

    private final boolean restoreStateInternal(int id2, final Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(id2));
        x.H(this.backStackMap.values(), new bk.l<String, Boolean>() { // from class: androidx.navigation.NavController.restoreStateInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(p.e(str2, str));
            }
        });
        final List<NavBackStackEntry> listInstantiateBackStack = instantiateBackStack((i) ck.x.d(this.backStackStates).remove(str));
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : listInstantiateBackStack) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) b0.s0(arrayList);
            if (p.e((list == null || (navBackStackEntry = (NavBackStackEntry) b0.r0(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(s.q(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList) {
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) b0.f0(list2)).getDestination().getNavigatorName());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            navigateInternal(navigator, list2, navOptions, navigatorExtras, new bk.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.restoreStateInternal.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry3) {
                    invoke2(navBackStackEntry3);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> listK;
                    p.j(navBackStackEntry3, "entry");
                    ref$BooleanRef.element = true;
                    int iIndexOf = listInstantiateBackStack.indexOf(navBackStackEntry3);
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        listK = listInstantiateBackStack.subList(ref$IntRef.element, i10);
                        ref$IntRef.element = i10;
                    } else {
                        listK = s.k();
                    }
                    this.addEntryToBackStack(navBackStackEntry3.getDestination(), args, navBackStackEntry3, listK);
                }
            });
        }
        return ref$BooleanRef.element;
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        int i10 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        p.g(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        p.g(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        p.g(intArray);
        List<Integer> listR0 = n.r0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        int iIntValue = ((Number) x.K(listR0)).intValue();
        if (parcelableArrayList != null) {
        }
        if (listR0.isEmpty()) {
            return false;
        }
        NavDestination navDestinationFindDestination = findDestination(getGraph(), iIntValue);
        if (navDestinationFindDestination instanceof NavGraph) {
            iIntValue = NavGraph.INSTANCE.findStartDestination((NavGraph) navDestinationFindDestination).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (!(currentDestination != null && iIntValue == currentDestination.getId())) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
        Bundle bundleBundleOf = BundleKt.bundleOf(h.a(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            bundleBundleOf.putAll(bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : listR0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final void updateOnBackPressedCallbackEnabled() {
        this.onBackPressedCallback.setEnabled(this.enableOnBackPressedCallback && getDestinationCountOnBackStack() > 1);
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener onDestinationChangedListener) {
        p.j(onDestinationChangedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onDestinationChangedListeners.add(onDestinationChangedListener);
        if (!getBackQueue().isEmpty()) {
            NavBackStackEntry navBackStackEntryLast = getBackQueue().last();
            onDestinationChangedListener.onDestinationChanged(this, navBackStackEntryLast.getDestination(), navBackStackEntryLast.getArguments());
        }
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int destinationId) {
        return clearBackStackInternal(destinationId) && dispatchOnDestinationChanged();
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z10) {
        this.enableOnBackPressedCallback = z10;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public i<NavBackStackEntry> getBackQueue() {
        return this.backQueue;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    public final qk.c<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    @MainThread
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        if (navGraph != null) {
            return navGraph;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    /* JADX INFO: renamed from: getNavigatorProvider, reason: from getter */
    public NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int navGraphId) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
        }
        NavBackStackEntry backStackEntry = getBackStackEntry(navGraphId);
        if (backStackEntry.getDestination() instanceof NavGraph) {
            return backStackEntry;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + navGraphId + " is on the NavController's back stack").toString());
    }

    public final u<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    @MainThread
    public boolean handleDeepLink(Intent intent) {
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink;
        Bundle bundleAddInDefaultArgs;
        int[] iArr;
        NavDestination navDestinationFindNode;
        NavGraph navGraph;
        Bundle bundle;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null;
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null) {
            NavGraph navGraph2 = this._graph;
            p.g(navGraph2);
            deepLinkMatchMatchDeepLink = navGraph2.matchDeepLink(new NavDeepLinkRequest(intent));
            if (deepLinkMatchMatchDeepLink != null) {
                NavDestination destination = deepLinkMatchMatchDeepLink.getDestination();
                int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
                bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs());
                if (bundleAddInDefaultArgs != null) {
                    bundle2.putAll(bundleAddInDefaultArgs);
                }
                iArr = iArrBuildDeepLinkIds$default;
                parcelableArrayList = null;
            } else {
                iArr = intArray;
            }
        } else if (intArray.length == 0) {
            NavGraph navGraph3 = this._graph;
            p.g(navGraph3);
            deepLinkMatchMatchDeepLink = navGraph3.matchDeepLink(new NavDeepLinkRequest(intent));
            if (deepLinkMatchMatchDeepLink != null) {
                NavDestination destination2 = deepLinkMatchMatchDeepLink.getDestination();
                int[] iArrBuildDeepLinkIds$default2 = NavDestination.buildDeepLinkIds$default(destination2, null, 1, null);
                bundleAddInDefaultArgs = destination2.addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs());
                if (bundleAddInDefaultArgs != null) {
                    bundle2.putAll(bundleAddInDefaultArgs);
                }
                iArr = iArrBuildDeepLinkIds$default2;
                parcelableArrayList = null;
            } else {
                iArr = intArray;
            }
        } else {
            iArr = intArray;
        }
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(iArr);
                if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
                    Log.i(TAG, "Could not find destination " + strFindInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle2.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                int length = iArr.length;
                Bundle[] bundleArr = new Bundle[length];
                for (int i11 = 0; i11 < length; i11++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i11] = bundle4;
                }
                int flags = intent.getFlags();
                int i12 = 268435456 & flags;
                if (i12 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(intent);
                    p.i(taskStackBuilderAddNextIntentWithParentStack, "create(context)\n        …ntWithParentStack(intent)");
                    taskStackBuilderAddNextIntentWithParentStack.startActivities();
                    Activity activity = this.activity;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i12 != 0) {
                    if (!getBackQueue().isEmpty()) {
                        NavGraph navGraph4 = this._graph;
                        p.g(navGraph4);
                        popBackStackInternal$default(this, navGraph4.getId(), true, false, 4, null);
                    }
                    while (i10 < iArr.length) {
                        int i13 = iArr[i10];
                        int i14 = i10 + 1;
                        Bundle bundle5 = bundleArr[i10];
                        final NavDestination navDestinationFindDestination = findDestination(i13);
                        if (navDestinationFindDestination == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, i13) + " cannot be found from the current destination " + getCurrentDestination());
                        }
                        navigate(navDestinationFindDestination, bundle5, NavOptionsBuilderKt.navOptions(new bk.l<NavOptionsBuilder, r>() { // from class: androidx.navigation.NavController.handleDeepLink.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // bk.l
                            public /* bridge */ /* synthetic */ r invoke(NavOptionsBuilder navOptionsBuilder) {
                                invoke2(navOptionsBuilder);
                                return r.f64562a;
                            }

                            /* JADX WARN: Code duplicated, block: B:17:0x0042  */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(NavOptionsBuilder navOptionsBuilder) {
                                boolean z10;
                                boolean z11;
                                p.j(navOptionsBuilder, "$this$navOptions");
                                navOptionsBuilder.anim(new bk.l<AnimBuilder, r>() { // from class: androidx.navigation.NavController.handleDeepLink.2.1
                                    @Override // bk.l
                                    public /* bridge */ /* synthetic */ r invoke(AnimBuilder animBuilder) {
                                        invoke2(animBuilder);
                                        return r.f64562a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(AnimBuilder animBuilder) {
                                        p.j(animBuilder, "$this$anim");
                                        animBuilder.setEnter(0);
                                        animBuilder.setExit(0);
                                    }
                                });
                                NavDestination navDestination = navDestinationFindDestination;
                                if (navDestination instanceof NavGraph) {
                                    kk.i<NavDestination> hierarchy = NavDestination.INSTANCE.getHierarchy(navDestination);
                                    NavController navController = this;
                                    Iterator<NavDestination> it = hierarchy.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z11 = true;
                                            break;
                                        }
                                        NavDestination next = it.next();
                                        NavDestination currentDestination = navController.getCurrentDestination();
                                        if (p.e(next, currentDestination != null ? currentDestination.getParent() : null)) {
                                            z11 = false;
                                            break;
                                        }
                                    }
                                    z10 = z11;
                                }
                                if (z10 && NavController.deepLinkSaveState) {
                                    navOptionsBuilder.popUpTo(NavGraph.INSTANCE.findStartDestination(this.getGraph()).getId(), new bk.l<PopUpToBuilder, r>() { // from class: androidx.navigation.NavController.handleDeepLink.2.2
                                        @Override // bk.l
                                        public /* bridge */ /* synthetic */ r invoke(PopUpToBuilder popUpToBuilder) {
                                            invoke2(popUpToBuilder);
                                            return r.f64562a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PopUpToBuilder popUpToBuilder) {
                                            p.j(popUpToBuilder, "$this$popUpTo");
                                            popUpToBuilder.setSaveState(true);
                                        }
                                    });
                                }
                            }
                        }), (Navigator.Extras) null);
                        i10 = i14;
                    }
                    return true;
                }
                NavGraph navGraph5 = this._graph;
                int length2 = iArr.length;
                for (int i15 = 0; i15 < length2; i15++) {
                    int i16 = iArr[i15];
                    Bundle bundle6 = bundleArr[i15];
                    if (i15 == 0) {
                        navDestinationFindNode = this._graph;
                    } else {
                        p.g(navGraph5);
                        navDestinationFindNode = navGraph5.findNode(i16);
                    }
                    if (navDestinationFindNode == null) {
                        throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.context, i16) + " cannot be found in graph " + navGraph5);
                    }
                    if (i15 == iArr.length - 1) {
                        NavOptions.Builder builder = new NavOptions.Builder();
                        NavGraph navGraph6 = this._graph;
                        p.g(navGraph6);
                        navigate(navDestinationFindNode, bundle6, NavOptions.Builder.setPopUpTo$default(builder, navGraph6.getId(), true, false, 4, (Object) null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                    } else if (navDestinationFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationFindNode;
                            p.g(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestId()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationFindNode = navGraph.findNode(navGraph.getStartDestId());
                        }
                        navGraph5 = navGraph;
                    }
                }
                this.deepLinkHandled = true;
                return true;
            }
        }
        return false;
    }

    @MainThread
    public void navigate(@IdRes int i10, Bundle bundle) {
        navigate(i10, bundle, (NavOptions) null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, bk.a<r> onComplete) {
        p.j(popUpTo, "popUpTo");
        p.j(onComplete, "onComplete");
        int iIndexOf = getBackQueue().indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != getBackQueue().size()) {
            popBackStackInternal(getBackQueue().get(i10).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            x.C(arrayList, arrayList2);
        }
        i<NavBackStackEntry> backQueue = getBackQueue();
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : backQueue) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        x.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener onDestinationChangedListener) {
        p.j(onDestinationChangedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.onDestinationChangedListeners.remove(onDestinationChangedListener);
    }

    @CallSuper
    public void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + str);
                if (parcelableArray != null) {
                    Map<String, i<NavBackStackEntryState>> map = this.backStackStates;
                    p.i(str, "id");
                    i<NavBackStackEntryState> iVar = new i<>(parcelableArray.length);
                    Iterator itA = ck.b.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        if (parcelable == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        }
                        iVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, iVar);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle bundleOnSaveState = entry.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleOnSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!getBackQueue().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[getBackQueue().size()];
            Iterator<NavBackStackEntry> it = getBackQueue().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new NavBackStackEntryState(it.next());
                i10++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, i<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                i<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        s.u();
                    }
                    parcelableArr2[i12] = navBackStackEntryState;
                    i12 = i13;
                }
                bundle.putParcelableArray(KEY_BACK_STACK_STATES_PREFIX + key2, parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10) {
        setGraph(getNavInflater().inflate(i10), (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        p.j(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        p.j(lifecycleOwner, "owner");
        if (p.e(lifecycleOwner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        p.j(navigatorProvider, "navigatorProvider");
        if (!getBackQueue().isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
        }
        this._navigatorProvider = navigatorProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher onBackPressedDispatcher) {
        p.j(onBackPressedDispatcher, "dispatcher");
        if (p.e(onBackPressedDispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        onBackPressedDispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.lifecycleObserver);
        lifecycle.addObserver(this.lifecycleObserver);
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        p.j(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!getBackQueue().isEmpty() && (getBackQueue().last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, getBackQueue().last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntryM);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<NavBackStackEntry> listR0 = b0.R0(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : listR0) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.h(navBackStackEntry);
            }
            this._visibleEntries.h(populateVisibleEntries$navigation_runtime_release());
        }
        if (navBackStackEntryM != null) {
            return true;
        }
        return false;
    }

    private final int getDestinationCountOnBackStack() {
        i<NavBackStackEntry> backQueue = getBackQueue();
        int i10 = 0;
        if (!(backQueue instanceof Collection) || !backQueue.isEmpty()) {
            Iterator<NavBackStackEntry> it = backQueue.iterator();
            while (it.hasNext()) {
                if ((!(it.next().getDestination() instanceof NavGraph)) && (i10 = i10 + 1) < 0) {
                    s.t();
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lifecycleObserver$lambda-2, reason: not valid java name */
    public static final void m19lifecycleObserver$lambda2(NavController navController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.j(navController, "this$0");
        p.j(lifecycleOwner, "<anonymous parameter 0>");
        p.j(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        p.i(targetState, "event.targetState");
        navController.hostLifecycleState = targetState;
        if (navController._graph != null) {
            Iterator<NavBackStackEntry> it = navController.getBackQueue().iterator();
            while (it.hasNext()) {
                it.next().handleLifecycleEvent(event);
            }
        }
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return navController.popBackStackInternal(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z10, i<NavBackStackEntryState> iVar) {
        boolean z11;
        NavControllerViewModel navControllerViewModel;
        u<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        NavBackStackEntry navBackStackEntryLast = getBackQueue().last();
        if (p.e(navBackStackEntryLast, navBackStackEntry)) {
            getBackQueue().removeLast();
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntryLast.getDestination().getNavigatorName()));
            boolean z12 = true;
            if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (value = transitionsInProgress.getValue()) != null && value.contains(navBackStackEntryLast)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !this.parentToChildCount.containsKey(navBackStackEntryLast)) {
                z12 = false;
            }
            Lifecycle.State currentState = navBackStackEntryLast.getLifecycle().getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z10) {
                    navBackStackEntryLast.setMaxLifecycle(state);
                    iVar.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
                }
                if (!z12) {
                    navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.DESTROYED);
                    unlinkChildFromParent$navigation_runtime_release(navBackStackEntryLast);
                } else {
                    navBackStackEntryLast.setMaxLifecycle(state);
                }
            }
            if (!z10 && !z12 && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(navBackStackEntryLast.getId());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntryLast.getDestination() + ')').toString());
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        NavDestination currentDestination = getCurrentDestination();
        p.g(currentDestination);
        int id2 = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestId() != id2) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    p.g(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        p.g(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            p.g(activity3);
                            bundle.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this._graph;
                            p.g(navGraph);
                            Activity activity4 = this.activity;
                            p.g(activity4);
                            Intent intent = activity4.getIntent();
                            p.i(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (deepLinkMatchMatchDeepLink != null) {
                                bundle.putAll(deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return getBackQueue().m();
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        Object next;
        Iterator it = b0.B0(getBackQueue()).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = kk.r.g(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                return (NavBackStackEntry) next;
            }
        }
        next = null;
        return (NavBackStackEntry) next;
    }

    @MainThread
    public void navigate(@IdRes int i10, Bundle bundle, NavOptions navOptions) {
        navigate(i10, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public boolean navigateUp() {
        Bundle extras;
        Intent intent;
        if (getDestinationCountOnBackStack() == 1) {
            Activity activity = this.activity;
            int[] intArray = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                extras = intent.getExtras();
            } else {
                extras = null;
            }
            if (extras != null) {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            }
            if (intArray != null) {
                return tryRelaunchUpToExplicitStack();
            }
            return tryRelaunchUpToGeneratedStack();
        }
        return popBackStack();
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive) {
        return popBackStack(destinationId, inclusive, false);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i10, Bundle bundle) {
        setGraph(getNavInflater().inflate(i10), bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        p.j(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (p.e(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (getBackQueue().isEmpty()) {
            this.viewModel = companion.getInstance(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    public final void updateBackStackLifecycle$navigation_runtime_release() {
        NavDestination parent;
        Boolean boolValueOf;
        u<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> listR0 = b0.R0(getBackQueue());
        if (listR0.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) b0.r0(listR0)).getDestination();
        if (destination instanceof FloatingWindow) {
            Iterator it = b0.B0(listR0).iterator();
            while (true) {
                if (it.hasNext()) {
                    parent = ((NavBackStackEntry) it.next()).getDestination();
                    if (!(parent instanceof NavGraph) && !(parent instanceof FloatingWindow)) {
                        break;
                    }
                } else {
                    parent = null;
                    break;
                }
            }
        } else {
            parent = null;
            break;
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : b0.B0(listR0)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination2 = navBackStackEntry.getDestination();
            if (destination != null && destination2.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (value = transitionsInProgress.getValue()) != null) {
                        boolValueOf = Boolean.valueOf(value.contains(navBackStackEntry));
                    } else {
                        boolValueOf = null;
                    }
                    if (!p.e(boolValueOf, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry);
                        boolean z10 = false;
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z10 = true;
                        }
                        if (!z10) {
                            map.put(navBackStackEntry, state);
                        } else {
                            map.put(navBackStackEntry, Lifecycle.State.STARTED);
                        }
                    } else {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    }
                }
                destination = destination.getParent();
            } else if (parent != null && destination2.getId() == parent.getId()) {
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                parent = parent.getParent();
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : listR0) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int destinationId, boolean inclusive, final boolean saveState) {
        NavDestination navDestination;
        if (getBackQueue().isEmpty()) {
            return false;
        }
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        Iterator it = b0.B0(getBackQueue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(navigator);
            }
            if (destination.getId() == destinationId) {
                navDestination = destination;
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.INSTANCE.getDisplayName(this.context, destinationId) + " as it was not found on the current back stack");
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final i<NavBackStackEntryState> iVar = new i<>();
        for (Navigator<? extends NavDestination> navigator2 : arrayList) {
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            popBackStackInternal(navigator2, getBackQueue().last(), saveState, new bk.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.popBackStackInternal.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry) {
                    p.j(navBackStackEntry, "entry");
                    ref$BooleanRef2.element = true;
                    ref$BooleanRef.element = true;
                    this.popEntryFromBackStack(navBackStackEntry, saveState, iVar);
                }
            });
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (saveState) {
            if (!inclusive) {
                for (NavDestination navDestination2 : SequencesKt___SequencesKt.R(kk.r.p(navDestination, new bk.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController.popBackStackInternal.3
                    @Override // bk.l
                    public final NavDestination invoke(NavDestination navDestination3) {
                        p.j(navDestination3, "destination");
                        NavGraph parent = navDestination3.getParent();
                        boolean z10 = false;
                        if (parent != null && parent.getStartDestId() == navDestination3.getId()) {
                            z10 = true;
                        }
                        if (z10) {
                            return navDestination3.getParent();
                        }
                        return null;
                    }
                }), new bk.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController.popBackStackInternal.4
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public final Boolean invoke(NavDestination navDestination3) {
                        p.j(navDestination3, "destination");
                        return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(navDestination3.getId())));
                    }
                })) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState navBackStackEntryStateJ = iVar.j();
                    map.put(numValueOf, navBackStackEntryStateJ != null ? navBackStackEntryStateJ.getId() : null);
                }
            }
            if (!iVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = iVar.first();
                Iterator it2 = SequencesKt___SequencesKt.R(kk.r.p(findDestination(navBackStackEntryStateFirst.getDestinationId()), new bk.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController.popBackStackInternal.6
                    @Override // bk.l
                    public final NavDestination invoke(NavDestination navDestination3) {
                        p.j(navDestination3, "destination");
                        NavGraph parent = navDestination3.getParent();
                        boolean z10 = false;
                        if (parent != null && parent.getStartDestId() == navDestination3.getId()) {
                            z10 = true;
                        }
                        if (z10) {
                            return navDestination3.getParent();
                        }
                        return null;
                    }
                }), new bk.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController.popBackStackInternal.7
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public final Boolean invoke(NavDestination navDestination3) {
                        p.j(navDestination3, "destination");
                        return Boolean.valueOf(!NavController.this.backStackMap.containsKey(Integer.valueOf(navDestination3.getId())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryStateFirst.getId());
                }
                this.backStackStates.put(navBackStackEntryStateFirst.getId(), iVar);
            }
        }
        updateOnBackPressedCallbackEnabled();
        return ref$BooleanRef.element;
    }

    @MainThread
    public void navigate(@IdRes int i10, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination destination;
        int destinationId;
        if (getBackQueue().isEmpty()) {
            destination = this._graph;
        } else {
            destination = getBackQueue().last().getDestination();
        }
        if (destination != null) {
            NavAction action = destination.getAction(i10);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                destinationId = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                destinationId = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (destinationId == 0 && navOptions != null && navOptions.getPopUpToId() != -1) {
                popBackStack(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive());
                return;
            }
            if (destinationId != 0) {
                NavDestination navDestinationFindDestination = findDestination(destinationId);
                if (navDestinationFindDestination == null) {
                    NavDestination.Companion companion = NavDestination.INSTANCE;
                    String displayName = companion.getDisplayName(this.context, destinationId);
                    if (!(action == null)) {
                        throw new IllegalArgumentException(("Navigation destination " + displayName + " referenced from action " + companion.getDisplayName(this.context, i10) + " cannot be found from the current destination " + destination).toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
                }
                navigate(navDestinationFindDestination, bundle2, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("no current navigation node");
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return popBackStackInternal(destinationId, inclusive, saveState) && dispatchOnDestinationChanged();
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph navGraph, Bundle bundle) {
        p.j(navGraph, "graph");
        if (!p.e(this._graph, navGraph)) {
            NavGraph navGraph2 = this._graph;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.backStackMap.keySet())) {
                    p.i(num, "id");
                    clearBackStackInternal(num.intValue());
                }
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            this._graph = navGraph;
            onGraphCreated(bundle);
            return;
        }
        int size = navGraph.getNodes().size();
        for (int i10 = 0; i10 < size; i10++) {
            NavDestination navDestinationValueAt = navGraph.getNodes().valueAt(i10);
            NavGraph navGraph3 = this._graph;
            p.g(navGraph3);
            navGraph3.getNodes().replace(i10, navDestinationValueAt);
            i<NavBackStackEntry> backQueue = getBackQueue();
            ArrayList<NavBackStackEntry> arrayList = new ArrayList();
            for (NavBackStackEntry navBackStackEntry : backQueue) {
                if (navDestinationValueAt != null && navBackStackEntry.getDestination().getId() == navDestinationValueAt.getId()) {
                    arrayList.add(navBackStackEntry);
                }
            }
            for (NavBackStackEntry navBackStackEntry2 : arrayList) {
                p.i(navDestinationValueAt, "newDestination");
                navBackStackEntry2.setDestination(navDestinationValueAt);
            }
        }
    }

    private final NavDestination findDestination(NavDestination navDestination, @IdRes int i10) {
        NavGraph parent;
        if (navDestination.getId() == i10) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            p.g(parent);
        }
        return parent.findNode(i10);
    }

    @MainThread
    public final boolean popBackStack(String route, boolean inclusive, boolean saveState) {
        p.j(route, "route");
        return popBackStack(NavDestination.INSTANCE.createRoute(route).hashCode(), inclusive, saveState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String destinationRoute) {
        NavGraph destination;
        NavGraph parent;
        p.j(destinationRoute, "destinationRoute");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        p.g(navGraph);
        if (p.e(navGraph.getRoute(), destinationRoute)) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntryM = getBackQueue().m();
        if (navBackStackEntryM == null || (destination = navBackStackEntryM.getDestination()) == null) {
            destination = this._graph;
            p.g(destination);
        }
        if (destination instanceof NavGraph) {
            parent = destination;
        } else {
            parent = destination.getParent();
            p.g(parent);
        }
        return parent.findNode(destinationRoute);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        NavBackStackEntry navBackStackEntryPrevious;
        p.j(route, "route");
        i<NavBackStackEntry> backQueue = getBackQueue();
        ListIterator<NavBackStackEntry> listIterator = backQueue.listIterator(backQueue.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!p.e(navBackStackEntryPrevious.getDestination().getRoute(), route));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @MainThread
    public void navigate(Uri uri) {
        p.j(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null));
    }

    @MainThread
    public void navigate(Uri uri, NavOptions navOptions) {
        p.j(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(Uri uri, NavOptions navOptions, Navigator.Extras extras) {
        p.j(uri, "deepLink");
        navigate(new NavDeepLinkRequest(uri, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest navDeepLinkRequest) {
        p.j(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        navigate(navDeepLinkRequest, (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest navDeepLinkRequest, NavOptions navOptions) {
        p.j(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        navigate(navDeepLinkRequest, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest navDeepLinkRequest, NavOptions navOptions, Navigator.Extras extras) {
        p.j(navDeepLinkRequest, AdActivity.REQUEST_KEY_EXTRA);
        NavGraph navGraph = this._graph;
        p.g(navGraph);
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = navGraph.matchDeepLink(navDeepLinkRequest);
        if (deepLinkMatchMatchDeepLink != null) {
            Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLink.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLink.getMatchingArgs());
            if (bundleAddInDefaultArgs == null) {
                bundleAddInDefaultArgs = new Bundle();
            }
            NavDestination destination = deepLinkMatchMatchDeepLink.getDestination();
            Intent intent = new Intent();
            intent.setDataAndType(navDeepLinkRequest.getUri(), navDeepLinkRequest.getMimeType());
            intent.setAction(navDeepLinkRequest.getAction());
            bundleAddInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
            navigate(destination, bundleAddInDefaultArgs, navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + navDeepLinkRequest + " cannot be found in the navigation graph " + this._graph);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0119 A[LOOP:1: B:44:0x0113->B:46:0x0119, LOOP_END] */
    @MainThread
    private final void navigate(final NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        boolean z10;
        NavDestination destination;
        Iterator<T> it;
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            } else {
                ((NavControllerNavigatorState) it2.next()).setNavigating(true);
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        boolean zPopBackStackInternal = (navOptions == null || navOptions.getPopUpToId() == -1) ? false : popBackStackInternal(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
        final Bundle bundleAddInDefaultArgs = navDestination.addInDefaultArgs(bundle);
        if ((navOptions != null && navOptions.getRestoreState()) && this.backStackMap.containsKey(Integer.valueOf(navDestination.getId()))) {
            ref$BooleanRef.element = restoreStateInternal(navDestination.getId(), bundleAddInDefaultArgs, navOptions, extras);
        } else {
            NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(navDestination.getNavigatorName());
            if (navOptions != null && navOptions.getSingleTop()) {
                if ((currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null || navDestination.getId() != destination.getId()) ? false : true) {
                    unlinkChildFromParent$navigation_runtime_release(getBackQueue().removeLast());
                    NavBackStackEntry navBackStackEntry = new NavBackStackEntry(currentBackStackEntry, bundleAddInDefaultArgs);
                    getBackQueue().addLast(navBackStackEntry);
                    NavGraph parent = navBackStackEntry.getDestination().getParent();
                    if (parent != null) {
                        linkChildToParent(navBackStackEntry, getBackStackEntry(parent.getId()));
                    }
                    navigator.onLaunchSingleTop(navBackStackEntry);
                }
                updateOnBackPressedCallbackEnabled();
                it = this.navigatorState.values().iterator();
                while (it.hasNext()) {
                    ((NavControllerNavigatorState) it.next()).setNavigating(false);
                }
                if (zPopBackStackInternal && !ref$BooleanRef.element && !z10) {
                    updateBackStackLifecycle$navigation_runtime_release();
                    return;
                } else {
                    dispatchOnDestinationChanged();
                }
            }
            navigateInternal(navigator, nj.r.e(NavBackStackEntry.Companion.create$default(NavBackStackEntry.INSTANCE, this.context, navDestination, bundleAddInDefaultArgs, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null)), navOptions, extras, new bk.l<NavBackStackEntry, r>() { // from class: androidx.navigation.NavController.navigate.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(NavBackStackEntry navBackStackEntry2) {
                    invoke2(navBackStackEntry2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry navBackStackEntry2) {
                    p.j(navBackStackEntry2, "it");
                    ref$BooleanRef.element = true;
                    NavController.addEntryToBackStack$default(this, navDestination, bundleAddInDefaultArgs, navBackStackEntry2, null, 8, null);
                }
            });
        }
        z10 = false;
        updateOnBackPressedCallbackEnabled();
        it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(false);
        }
        if (zPopBackStackInternal) {
        }
        dispatchOnDestinationChanged();
    }

    @MainThread
    public void navigate(NavDirections navDirections) {
        p.j(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections navDirections, NavOptions navOptions) {
        p.j(navDirections, "directions");
        navigate(navDirections.getActionId(), navDirections.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections navDirections, Navigator.Extras extras) {
        p.j(navDirections, "directions");
        p.j(extras, "navigatorExtras");
        navigate(navDirections.getActionId(), navDirections.getArguments(), (NavOptions) null, extras);
    }

    public final void navigate(String str, bk.l<? super NavOptionsBuilder, r> lVar) {
        p.j(str, "route");
        p.j(lVar, "builder");
        navigate$default(this, str, NavOptionsBuilderKt.navOptions(lVar), null, 4, null);
    }

    public final void navigate(String str, NavOptions navOptions, Navigator.Extras extras) {
        p.j(str, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.INSTANCE;
        Uri uri = Uri.parse(NavDestination.INSTANCE.createRoute(str));
        p.f(uri, "Uri.parse(this)");
        navigate(companion.fromUri(uri).build(), navOptions, extras);
    }
}
