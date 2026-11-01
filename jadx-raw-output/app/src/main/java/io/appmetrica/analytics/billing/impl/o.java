package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String currencyCode;
        int i10;
        z zVar = new z();
        zVar.f54503a = productInfo.quantity;
        zVar.f54508f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        Charset charset = lk.c.f63591b;
        zVar.f54504b = currencyCode.getBytes(charset);
        zVar.f54505c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f54469a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f54470b = productInfo.signature.getBytes(charset);
        zVar.f54507e = uVar;
        int i11 = 1;
        zVar.f54509g = true;
        zVar.f54510h = 1;
        int i12 = n.f54456a[productInfo.type.ordinal()];
        zVar.f54511i = (i12 == 1 || i12 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f54492a = productInfo.purchaseToken.getBytes(charset);
        yVar.f54493b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f54512j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f54485a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f54482a = period.number;
                int i13 = n.f54457b[period.timeUnit.ordinal()];
                if (i13 == 1) {
                    i10 = 1;
                } else if (i13 == 2) {
                    i10 = 2;
                } else if (i13 != 3) {
                    i10 = i13 != 4 ? 0 : 4;
                } else {
                    i10 = 3;
                }
                wVar.f54483b = i10;
                xVar.f54486b = wVar;
            }
            v vVar = new v();
            vVar.f54472a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f54482a = period2.number;
                int i14 = n.f54457b[period2.timeUnit.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        i11 = 2;
                    } else if (i14 != 3) {
                        i11 = i14 != 4 ? 0 : 4;
                    } else {
                        i11 = 3;
                    }
                }
                wVar2.f54483b = i11;
                vVar.f54473b = wVar2;
            }
            vVar.f54474c = productInfo.introductoryPriceCycles;
            xVar.f54487c = vVar;
            zVar.f54513k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
