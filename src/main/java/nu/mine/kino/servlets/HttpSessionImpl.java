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

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class HttpSessionImpl implements HttpSession {

    @Override
    public long getCreationTime() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public String getId() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public long getLastAccessedTime() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public ServletContext getServletContext() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void setMaxInactiveInterval(int interval) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public int getMaxInactiveInterval() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public HttpSessionContext getSessionContext() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Object getAttribute(String name) {
        return sessionMap.get(name);
    }

    @Override
    public Object getValue(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String[] getValueNames() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    private Map<String, Object> sessionMap = new HashMap<String, Object>();

    @Override
    public void setAttribute(String name, Object value) {
        sessionMap.put(name, value);
    }

    @Override
    public void putValue(String name, Object value) {

    }

    @Override
    public void removeAttribute(String name) {
        sessionMap.remove(name);
    }

    @Override
    public void removeValue(String name) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void invalidate() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public boolean isNew() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

}
