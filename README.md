SWER415 Project - CI/CD Pipeline for Spring Boot REST Service
Branching Strategy
We use GitFlow for version control to ensure structured development and release management.
Branch Structure

main: Contains production-ready code. Only updated via merges from release/* or hotfix/* branches.
develop: Integration branch for new features. Feature branches are merged here after PR approval.
feature/*: For developing new features (e.g., feature/ci-cd-pipeline). Branched from develop and merged back after completion.
release/*: For preparing releases. Branched from develop, merged into main and develop after testing.
hotfix/*: For urgent production fixes. Branched from main, merged back to main and develop.

Merge Policies

All merges to main and develop require a pull request (PR) with at least one reviewer approval.
PRs must pass CI/CD pipeline checks (build, test, static analysis) before merging.
Commits should be small and incremental to facilitate debugging and pipeline observation.

