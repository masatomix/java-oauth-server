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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 * @author Masatomi KINO
 * @version $Revision$
 */
public class HttpServletRequestImpl implements HttpServletRequest {

    @Override
    public Object getAttribute(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getCharacterEncoding() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void setCharacterEncoding(String env)
            throws UnsupportedEncodingException {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public int getContentLength() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public String getContentType() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getParameter(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<String> getParameterNames() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String[] getParameterValues(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getProtocol() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getScheme() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getServerName() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public int getServerPort() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRemoteAddr() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRemoteHost() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void setAttribute(String name, Object o) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void removeAttribute(String name) {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public Locale getLocale() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<Locale> getLocales() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public boolean isSecure() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String path) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRealPath(String path) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public int getRemotePort() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public String getLocalName() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getLocalAddr() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public int getLocalPort() {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public ServletContext getServletContext() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public AsyncContext startAsync() throws IllegalStateException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public AsyncContext startAsync(ServletRequest servletRequest,
            ServletResponse servletResponse) throws IllegalStateException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public boolean isAsyncStarted() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isAsyncSupported() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public AsyncContext getAsyncContext() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public DispatcherType getDispatcherType() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getAuthType() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Cookie[] getCookies() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public long getDateHeader(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public String getHeader(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<String> getHeaders(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Enumeration<String> getHeaderNames() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public int getIntHeader(String name) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public String getMethod() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getPathInfo() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getPathTranslated() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getContextPath() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getQueryString() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRemoteUser() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public boolean isUserInRole(String role) {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public Principal getUserPrincipal() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRequestedSessionId() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getRequestURI() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public StringBuffer getRequestURL() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public String getServletPath() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    private static HttpSession session = null;

    @Override
    public HttpSession getSession(boolean create) {
        if (session == null) {
            session = new HttpSessionImpl();
        }
        return session;
    }

    @Override
    public HttpSession getSession() {
        if (session == null) {
            session = new HttpSessionImpl();
        }
        return session;
    }

    @Override
    public boolean isRequestedSessionIdValid() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromCookie() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromURL() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromUrl() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public boolean authenticate(HttpServletResponse response)
            throws IOException, ServletException {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public void login(String username, String password)
            throws ServletException {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void logout() throws ServletException {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public Collection<Part> getParts() throws IOException, ServletException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Part getPart(String name) throws IOException, ServletException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

}
