package com.pydio.sdk.core.common.callback;

import com.pydio.sdk.core.model.Message;

public interface MessageHandler {
    void onMessage(Message m);
}
