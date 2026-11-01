package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface UserOrBuilder extends MessageOrBuilder {
    String getCcpa();

    ByteString getCcpaBytes();

    String getConsent();

    ByteString getConsentBytes();

    boolean getCoppa();

    boolean getGdpr();

    String getGpp();

    ByteString getGppBytes();

    int getGppSid(int i10);

    int getGppSidCount();

    List<Integer> getGppSidList();
}
