/*
 *   Copyright (C) 2017 Nitesh Tiwari.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.bbmyjio.contactextractor.contacts.model.api;

/**
 * Created by Sandeep.Dude on 21-01-2017.
 */
public class Name
{
    private String familyName;

    private String givenName;

    private String displayName;

    public String getFamilyName ()
    {
        return familyName;
    }

    public void setFamilyName (String familyName)
    {
        this.familyName = familyName;
    }

    public String getGivenName ()
    {
        return givenName;
    }

    public void setGivenName (String givenName)
    {
        this.givenName = givenName;
    }

    public String getDisplayName ()
    {
        return displayName;
    }

    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [familyName = "+familyName+", givenName = "+givenName+", displayName = "+displayName+"]";
    }
}