# AOCP Deployment Orchestration Pipeline

Jenkins pipeline intended to consume all the other pipelines to orchestrate an initial deployment of an environment. This pipeline will also be leveraged for updating existing environments.
Functionality
1. use the Jenkins shared library CosmoDB Facade to r/w to database
2. instantiate the Terraform Orchestration pipeline
3. instantiate the OCP Deployment pipeline
4. instantiate the Application Configuration pipeline

## Terraform Orchestration Pipeline

Pipeline to provision Core Infrastructure, VMs, Load Balancers, Firewalls, etc...

## OCP Configuration Pipeline

OCP Deployment pipeline is executed to install and configure applications; orchestrated by Jenkins to ensure proper ordering of installs

## Application Configuration Pipeline

All purpose Application Configuration pipelines executed for installation and configuration of non-aura applications

