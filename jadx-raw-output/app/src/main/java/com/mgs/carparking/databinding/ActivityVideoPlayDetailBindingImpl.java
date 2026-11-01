package com.mgs.carparking.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ObservableScrollView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.rv.ScrollRecyclerView;
import com.ruffian.library.widget.RTextView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import w9.c3;
import w9.e3;
import w9.s1;
import w9.y0;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityVideoPlayDetailBindingImpl extends ActivityVideoPlayDetailBinding {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f40018c0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f40019d0;

    @NonNull
    public final LinearLayout J;

    @NonNull
    public final RelativeLayout K;

    @NonNull
    public final ConstraintLayout L;

    @NonNull
    public final ImageView M;

    @NonNull
    public final TextView N;

    @NonNull
    public final RelativeLayout O;

    @NonNull
    public final TextView P;

    @NonNull
    public final ImageView Q;

    @NonNull
    public final RelativeLayout R;

    @NonNull
    public final TextView S;

    @NonNull
    public final ScrollRecyclerView T;

    @NonNull
    public final RelativeLayout U;

    @NonNull
    public final RelativeLayout V;

    @NonNull
    public final Button W;

    @NonNull
    public final RelativeLayout X;

    @NonNull
    public final TextView Y;

    @NonNull
    public final TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NonNull
    public final TextView f40020a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f40021b0;

    public ActivityVideoPlayDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 51, f40018c0, f40019d0));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x021a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0223  */
    /* JADX WARN: Code duplicated, block: B:121:0x022f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0242  */
    /* JADX WARN: Code duplicated, block: B:126:0x0247  */
    /* JADX WARN: Code duplicated, block: B:129:0x0251  */
    /* JADX WARN: Code duplicated, block: B:130:0x0258  */
    /* JADX WARN: Code duplicated, block: B:133:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0261  */
    /* JADX WARN: Code duplicated, block: B:135:0x0265  */
    /* JADX WARN: Code duplicated, block: B:139:0x026d  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:144:0x027f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0281  */
    /* JADX WARN: Code duplicated, block: B:146:0x0286  */
    /* JADX WARN: Code duplicated, block: B:149:0x0290  */
    /* JADX WARN: Code duplicated, block: B:150:0x0297  */
    /* JADX WARN: Code duplicated, block: B:153:0x029e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:183:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0305  */
    /* JADX WARN: Code duplicated, block: B:185:0x030b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0313  */
    /* JADX WARN: Code duplicated, block: B:189:0x031d  */
    /* JADX WARN: Code duplicated, block: B:191:0x032b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0338 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x033a  */
    /* JADX WARN: Code duplicated, block: B:196:0x033d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0345  */
    /* JADX WARN: Code duplicated, block: B:200:0x034c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:205:0x035f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0369  */
    /* JADX WARN: Code duplicated, block: B:209:0x0370  */
    /* JADX WARN: Code duplicated, block: B:213:0x037e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0380  */
    /* JADX WARN: Code duplicated, block: B:215:0x0385  */
    /* JADX WARN: Code duplicated, block: B:218:0x038f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0396  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:225:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:228:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:229:0x03be  */
    /* JADX WARN: Code duplicated, block: B:232:0x03c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:234:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:238:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:239:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:245:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:249:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:252:0x0403 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0405  */
    /* JADX WARN: Code duplicated, block: B:254:0x040b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0414  */
    /* JADX WARN: Code duplicated, block: B:259:0x0417  */
    /* JADX WARN: Code duplicated, block: B:263:0x0422 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0424  */
    /* JADX WARN: Code duplicated, block: B:265:0x0429  */
    /* JADX WARN: Code duplicated, block: B:268:0x0433  */
    /* JADX WARN: Code duplicated, block: B:269:0x043a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0441 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0443  */
    /* JADX WARN: Code duplicated, block: B:274:0x0447  */
    /* JADX WARN: Code duplicated, block: B:278:0x044e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0451  */
    /* JADX WARN: Code duplicated, block: B:283:0x045e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x0460  */
    /* JADX WARN: Code duplicated, block: B:285:0x0463  */
    /* JADX WARN: Code duplicated, block: B:288:0x046b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0472  */
    /* JADX WARN: Code duplicated, block: B:292:0x047b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x047d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0482  */
    /* JADX WARN: Code duplicated, block: B:297:0x048c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0491  */
    /* JADX WARN: Code duplicated, block: B:302:0x049c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x049e  */
    /* JADX WARN: Code duplicated, block: B:304:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:307:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:308:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:312:0x04bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:314:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:318:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:321:0x04de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:322:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:323:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:326:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:327:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:329:0x0529  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01af  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d5  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:146:0x0286
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        /*
            Method dump skipped, instruction units count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.databinding.ActivityVideoPlayDetailBindingImpl.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f40021b0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f40021b0 = 33554432L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        y((VIDEOPLAYDETAILVIEWMODEL) obj);
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40019d0 = sparseIntArray;
        sparseIntArray.put(R.id.tv_no_net, 29);
        sparseIntArray.put(R.id.exo_play_context_id, 30);
        sparseIntArray.put(R.id.iv_back, 31);
        sparseIntArray.put(R.id.refresh_layout, 32);
        sparseIntArray.put(R.id.header, 33);
        sparseIntArray.put(R.id.scrollView, 34);
        sparseIntArray.put(R.id.joinSkipAd, 35);
        sparseIntArray.put(R.id.tvRightJoin, 36);
        sparseIntArray.put(R.id.tv_intro, 37);
        sparseIntArray.put(R.id.iv_video_right, 38);
        sparseIntArray.put(R.id.iv_sh, 39);
        sparseIntArray.put(R.id.iv_feed, 40);
        sparseIntArray.put(R.id.iv_down, 41);
        sparseIntArray.put(R.id.iv_collection, 42);
        sparseIntArray.put(R.id.rl_yuan, 43);
        sparseIntArray.put(R.id.tv_yuan_title, 44);
        sparseIntArray.put(R.id.iv_video_set_right, 45);
        sparseIntArray.put(R.id.iv_video_set_right_variety, 46);
        sparseIntArray.put(R.id.tv1, 47);
        sparseIntArray.put(R.id.img_loading, 48);
        sparseIntArray.put(R.id.iv_comment_head, 49);
        sparseIntArray.put(R.id.flContainer, 50);
    }

    public ActivityVideoPlayDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 24, (VideoPlayerView) objArr[30], (FrameLayout) objArr[50], (WaterDropHeader) objArr[33], (ImageView) objArr[48], (ImageView) objArr[31], (TextView) objArr[42], (CircularImageView) objArr[49], (TextView) objArr[41], (ConstraintLayout) objArr[11], (TextView) objArr[40], (ConstraintLayout) objArr[10], (TextView) objArr[39], (ConstraintLayout) objArr[9], (ImageView) objArr[38], (ImageView) objArr[45], (ImageView) objArr[46], (TextView) objArr[35], (FrameLayout) objArr[22], (SmartRefreshLayout) objArr[32], (RelativeLayout) objArr[23], (RelativeLayout) objArr[43], (RecyclerView) objArr[24], (RecyclerView) objArr[19], (RecyclerView) objArr[21], (ObservableScrollView) objArr[34], (RTextView) objArr[17], (TextView) objArr[47], (TextView) objArr[37], (TextView) objArr[29], (TextView) objArr[36], (TextView) objArr[14], (TextView) objArr[44], (ConstraintLayout) objArr[4]);
        this.f40021b0 = -1L;
        this.f40001j.setTag(null);
        this.f40003l.setTag(null);
        this.f40005n.setTag(null);
        this.f40010s.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[12];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[13];
        this.M = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[15];
        this.N = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[16];
        this.O = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[18];
        this.P = textView2;
        textView2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.Q = imageView2;
        imageView2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[20];
        this.R = relativeLayout3;
        relativeLayout3.setTag(null);
        TextView textView3 = (TextView) objArr[25];
        this.S = textView3;
        textView3.setTag(null);
        ScrollRecyclerView scrollRecyclerView = (ScrollRecyclerView) objArr[26];
        this.T = scrollRecyclerView;
        scrollRecyclerView.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[27];
        this.U = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[28];
        this.V = relativeLayout5;
        relativeLayout5.setTag(null);
        Button button = (Button) objArr[3];
        this.W = button;
        button.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[5];
        this.X = relativeLayout6;
        relativeLayout6.setTag(null);
        TextView textView4 = (TextView) objArr[6];
        this.Y = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[7];
        this.Z = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[8];
        this.f40020a0 = textView6;
        textView6.setTag(null);
        this.f40012u.setTag(null);
        this.f40014w.setTag(null);
        this.f40015x.setTag(null);
        this.f40016y.setTag(null);
        this.A.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public final boolean a(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        return true;
    }

    public final boolean b(ObservableField<Drawable> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 4;
        }
        return true;
    }

    public final boolean c(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 2;
        }
        return true;
    }

    public final boolean d(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return true;
    }

    public final boolean e(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 16384;
        }
        return true;
    }

    public final boolean f(ObservableField observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 2097152;
        }
        return true;
    }

    public final boolean g(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 8388608;
        }
        return true;
    }

    public final boolean h(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 512;
        }
        return true;
    }

    public final boolean i(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        return true;
    }

    public final boolean j(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 8;
        }
        return true;
    }

    public final boolean k(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    public final boolean l(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 64;
        }
        return true;
    }

    public final boolean m(ObservableList<y0> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    public final boolean n(ObservableList<s1> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        return true;
    }

    public final boolean o(ObservableList<e3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 128;
        }
        return true;
    }

    public final boolean p(ObservableList<c3> observableList, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 16;
        }
        return true;
    }

    public final boolean q(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 256;
        }
        return true;
    }

    public final boolean r(ObservableField<Boolean> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        return true;
    }

    public final boolean s(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        return true;
    }

    public final boolean t(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    public final boolean u(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
        }
        return true;
    }

    public final boolean v(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 1024;
        }
        return true;
    }

    public final boolean w(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 32;
        }
        return true;
    }

    public final boolean x(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f40021b0 |= 1;
        }
        return true;
    }

    public void y(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel) {
        this.I = videoplaydetailviewmodel;
        synchronized (this) {
            this.f40021b0 |= 16777216;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return x((ObservableField) obj, i11);
            case 1:
                return c((ObservableField) obj, i11);
            case 2:
                return b((ObservableField) obj, i11);
            case 3:
                return j((ObservableField) obj, i11);
            case 4:
                return p((ObservableList) obj, i11);
            case 5:
                return w((ObservableField) obj, i11);
            case 6:
                return l((ObservableField) obj, i11);
            case 7:
                return o((ObservableList) obj, i11);
            case 8:
                return q((ObservableField) obj, i11);
            case 9:
                return h((ObservableField) obj, i11);
            case 10:
                return v((ObservableField) obj, i11);
            case 11:
                return k((ObservableField) obj, i11);
            case 12:
                return t((ObservableField) obj, i11);
            case 13:
                return m((ObservableList) obj, i11);
            case 14:
                return e((ObservableField) obj, i11);
            case 15:
                return s((ObservableField) obj, i11);
            case 16:
                return i((ObservableField) obj, i11);
            case 17:
                return r((ObservableField) obj, i11);
            case 18:
                return a((ObservableField) obj, i11);
            case 19:
                return n((ObservableList) obj, i11);
            case 20:
                return d((ObservableField) obj, i11);
            case 21:
                return f((ObservableField) obj, i11);
            case 22:
                return u((ObservableField) obj, i11);
            case 23:
                return g((ObservableField) obj, i11);
            default:
                return false;
        }
    }
}
