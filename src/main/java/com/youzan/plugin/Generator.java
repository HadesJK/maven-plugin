package com.youzan.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * CountMojo
 * @goal generate
 * @author 一饭
 * @date 15/5/11 下午8:29
 */
public class Generator extends AbstractMojo {


    /**
     * Specifies whether the mojo writes progress messages to the log
     *
     * @parameter expression="${tableName}" default-value=undefined
     */

    private String tableName;

    /**
     * Specifies whether the mojo writes progress messages to the log
     *
     * @parameter expression="${targetPackage}" default-value=undefined
     */

    private String targetPackage;


    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            com.youzan.Generator.main(new String[] {tableName, targetPackage});
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

