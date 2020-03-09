/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thebuzzmedia.exiftool.core;

import com.thebuzzmedia.exiftool.Flag;

/**
 *
 * @author marco
 */
public enum StandardFlag implements Flag
{
    NONE(""),
    IGNORE_MINOR("-m");

    private final String argument;

    StandardFlag(String flagArg)
    {
        this.argument = flagArg;
    }

    @Override
    public String getArg()
    {
        return argument;
    }
}