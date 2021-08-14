package com.example.myblog.homepage

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContentDetailsRepository extends JpaRepository<ContentDetails, ContentId>
{

}