package org.adrenalinee.stomp.listener;

import org.adrenalinee.stomp.frame.Frame;

/**
 * 
 * @author shindongseong
 * @since 2015. 11. 7.
 */
public interface ErrorListener {
	
	void onError(final Frame frame);
}
