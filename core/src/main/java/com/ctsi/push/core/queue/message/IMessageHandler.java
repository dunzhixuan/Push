package com.ctsi.push.core.queue.message;

import com.ctsi.push.message.PushMessage;

/**
 * Created by doulala on 16/8/31.
 */
public interface IMessageHandler {


    /**
     * @param message
     * @return
     */
     boolean isMessageMatched(PushMessage message);

    /**
     *
     * @param message
     * 子线程中,建议同步操作
     */


     void execute(PushMessage message);
}
