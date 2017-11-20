/******************************************************************************
 * Copyright (c) 2014 Masatomi KINO and others. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *      Masatomi KINO - initial API and implementation
 * $Id$
 ******************************************************************************/
//作成日: 2017/11/21

package nu.mine.kino.servlets;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class HttpServletRequestManager {
    private static HttpServletRequest req = null;

    public static HttpServletRequest getInstance() {
        if (req == null) {
            req = new HttpServletRequestImpl();
        }
        return req;
    }
}
