<?php

namespace develnext\bundle\appgamekit;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;

use ide\Ide;
use ide\library\IdeLibraryBundleResource;
use ide\project\Project;


class AppGameKitBundle extends AbstractJarBundle
{
    public function onAdd(Project $project, AbstractBundle $owner = null)
    {
        parent::onAdd($project, $owner);

        Ide::get()->getMainForm()->toast("App Game Kit load!");
    }

    public function onRemove(Project $project, AbstractBundle $owner = null){
        parent::onRemove($project, $owner);
    }

    public function onRegister(IdeLibraryBundleResource $resource){
        parent::onRegister($resource);
    }
}