package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class RootProjectAccessor extends TypeSafeProjectDependencyFactory {


    @Inject
    public RootProjectAccessor(DefaultProjectDependencyFactory factory, ProjectFinder finder) {
        super(factory, finder);
    }

    /**
     * Creates a project dependency on the project at path ":"
     */
    public KotlinAndroidTemplateProjectDependency getKotlinAndroidTemplate() { return new KotlinAndroidTemplateProjectDependency(getFactory(), create(":")); }

    /**
     * Creates a project dependency on the project at path ":app"
     */
    public AppProjectDependency getApp() { return new AppProjectDependency(getFactory(), create(":app")); }

    /**
     * Creates a project dependency on the project at path ":library-android"
     */
    public LibraryAndroidProjectDependency getLibraryAndroid() { return new LibraryAndroidProjectDependency(getFactory(), create(":library-android")); }

    /**
     * Creates a project dependency on the project at path ":library-compose"
     */
    public LibraryComposeProjectDependency getLibraryCompose() { return new LibraryComposeProjectDependency(getFactory(), create(":library-compose")); }

    /**
     * Creates a project dependency on the project at path ":library-kotlin"
     */
    public LibraryKotlinProjectDependency getLibraryKotlin() { return new LibraryKotlinProjectDependency(getFactory(), create(":library-kotlin")); }

}
