package io.bidmachine.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import io.bidmachine.iab.vast.tags.AdContentTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VastProcessorResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastAd f59620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastSpecError f59621c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f59619a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59622d = true;

    public List a() {
        return this.f59619a;
    }

    public boolean b() {
        return this.f59622d;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.f59620b;
    }

    @Nullable
    public VastSpecError getVastSpecError() {
        return this.f59621c;
    }

    public boolean hasVastAd() {
        return this.f59620b != null;
    }

    public void a(AdContentTag adContentTag, VastSpecError vastSpecError) {
        a(vastSpecError);
        Bundle bundle = new Bundle();
        bundle.putInt(VastRequest.PARAMS_ERROR_CODE, vastSpecError.getCode());
        List<String> errorUrlList = adContentTag.getErrorUrlList();
        if (errorUrlList == null || errorUrlList.isEmpty()) {
            return;
        }
        Iterator<String> it = errorUrlList.iterator();
        while (it.hasNext()) {
            String strProcessUrl = VastUrlProcessorRegistry.processUrl(it.next(), bundle);
            if (!TextUtils.isEmpty(strProcessUrl)) {
                this.f59619a.add(strProcessUrl);
            }
        }
    }

    public void a(boolean z10) {
        this.f59622d = z10;
    }

    public void a(VastAd vastAd) {
        this.f59620b = vastAd;
    }

    public void a(VastSpecError vastSpecError) {
        this.f59621c = vastSpecError;
    }
}
